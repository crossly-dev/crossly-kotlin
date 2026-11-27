# Crossly Kotlin SDK

[![ci](https://github.com/crossly-dev/crossly-kotlin/actions/workflows/ci.yml/badge.svg)](https://github.com/crossly-dev/crossly-kotlin/actions/workflows/ci.yml) [![release](https://github.com/crossly-dev/crossly-kotlin/actions/workflows/release.yml/badge.svg)](https://github.com/crossly-dev/crossly-kotlin/actions/workflows/release.yml) [![Maven Central](https://img.shields.io/maven-central/v/net.crossly/crossly-kotlin)](https://central.sonatype.com/artifact/net.crossly/crossly-kotlin) [![license](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

Official Kotlin clients for the [Crossly](https://crossly.net) API: list once and sell across every marketplace, read
orders, manage inventory, and receive signed webhooks. Generated from the public OpenAPI specs and released
automatically when they change, with signed build provenance.

## Install

| client | for | install |
|---|---|---|
| seller | your store: listings, crossposting, orders, analytics | `net.crossly:crossly-kotlin` |
| buyer | shopping: cart, orders, wishlists, offers, cashback | `net.crossly:crossly-kotlin-buyer` |

## Two clients, two credentials

| client | credential |
|---|---|
| seller | a Personal Access Token (`crossly_pat_…`, Settings → Developer) or a seller OAuth token |
| buyer | a buyer OAuth token (`crossly_oat_…`) with `buyer:*` scopes |

They are not interchangeable: a seller token is refused by the buyer API and the reverse, even for the same
Crossly account. A 401 from a call that looks right usually means the other client's token.

## First call

```kotlin
// build.gradle.kts
implementation("net.crossly:crossly-kotlin:<latest release>")
```

```kotlin
import net.crossly.Crossly
import net.crossly.apis.ListingsApi

// Once, at start-up: the generated client builds its HTTP client on first use.
Crossly.configure(token = System.getenv("CROSSLY_TOKEN"))  // crossly_pat_…
val listings = ListingsApi()

// Every listing, page by page as the sequence is consumed.
// listListings(page, limit, platform, status, sku, updatedSince, kind, tag, stillLive)
Crossly.paginate({ page, limit -> listings.listListings(page, limit, null, null, null, null, null, null, null) }) { it.data }
    .forEach { println("${it.id} ${it.title} ${it.status}") }
```

`Crossly.configure` sets up the generated client (bearer token, `User-Agent: crossly-kotlin/<version>`,
timeouts) and adds what it lacks: a 429, a 5xx or a dropped connection is retried with exponential backoff that
honours `Retry-After`; every POST and PATCH carries an `Idempotency-Key`, so a retried write is applied once
(`Crossly.withIdempotencyKey(key) { … }` sets your own). `paginate` returns a lazy `Sequence`;
`net.crossly.client.paginateFlow` is the same as a `Flow` (bring kotlinx-coroutines). The buyer twin is
`net.crossly.buyer.CrosslyBuyer`.

List calls return `{ data, pagination }` and page with `page` and `limit`. Money fields named `…_cents` are
integer cents. Generated methods throw `ClientException` / `ServerException`; wrap a call in `Crossly.call { … }` (`paginate` does it for you) to get `net.crossly.client.CrosslyException` instead, with `status`, `code` (the API's `error.code`), `details`, `retryAfterSeconds` and `correlationId` for support.

## Webhooks

Crossly signs every webhook with `Crossly-Signature: t=<unix>,v1=<hex HMAC-SHA256 of "t.body">`. The verifier
ships in the seller and buyer packages and checks the signature in constant time, rejects a timestamp more than
five minutes old, and returns the parsed event:

```kotlin
import net.crossly.webhooks.CrosslyWebhooks

// rawBody: the exact bytes received, before any JSON parsing
val event: String = try {
    CrosslyWebhooks.verify(rawBody, signatureHeader, System.getenv("CROSSLY_WEBHOOK_SECRET"))
} catch (e: CrosslyWebhooks.VerificationException) {
    // e.reason: malformed_header | bad_signature | timestamp_out_of_tolerance | missing_secret -> answer 400
    return
}
```

Verify the raw bytes, not a re-serialised body. `webhooks/` holds the same verifier on its own, with the shared
test vectors every language's port is checked against on each build.

## Webhooks in Ktor

Install the route-scoped plugin on your webhook route: it verifies the signature over the raw body before the
handler runs, answers 400 to anything that does not verify, and leaves the verified JSON in
`call.crosslyWebhookBody`.

```kotlin
import net.crossly.webhooks.ktor.CrosslyWebhookVerification
import net.crossly.webhooks.ktor.crosslyWebhookBody

routing {
    route("/webhooks/crossly") {
        install(CrosslyWebhookVerification) { secret = System.getenv("CROSSLY_WEBHOOK_SECRET") }
        post {
            val event = call.crosslyWebhookBody  // parse with your own serializer; answer fast
            call.respond(HttpStatusCode.NoContent)
        }
    }
}
```

Ktor 3 is compiled against, not depended on: your app brings its own. In Spring, take the body as
`@RequestBody body: ByteArray` and pass it to `CrosslyWebhooks.verify` (do not add the Java SDK as well: both
ship a `net.crossly.webhooks.CrosslyWebhooks`, with different shapes).
Runnable versions are in [examples/](examples).

## Where things are

| client | API classes | models | API reference pages |
|---|---|---|---|
| seller | `seller/src/main/kotlin/net/crossly/apis/` | `seller/src/main/kotlin/net/crossly/models/<area>/` | `seller/docs/` |
| buyer | `buyer/src/main/kotlin/net/crossly/buyer/apis/` | `buyer/src/main/kotlin/net/crossly/buyer/models/<area>/` | `buyer/docs/` |

One class per API group (`OrdersApi`, `ListingsApi`, …), one model per type, the
models grouped one folder per product area (`vault`, `world`, `order`, …). A type
several endpoints share is ONE model, named after where it first appears
(`GetOrderResponse`, `ListOrdersItem`) or, for small shared shapes such as `{ ok }`,
after its fields (`OkResponse`). Each client README lists every method.

## Versions and changelog

Semantic versioning. While the version is 0.x, a release that removes an operation or a model bumps the minor
version; anything else bumps the patch. Every [CHANGELOG](CHANGELOG.md) entry lists the operations and models
that were added, changed or removed in the specs it was generated from.

## Verifying a release

Every release artifact is built on GitHub-hosted runners by [release.yml](.github/workflows/release.yml) and
carries a signed SLSA provenance attestation:

```sh
gh attestation verify <downloaded-file> --repo crossly-dev/crossly-kotlin
```

## Contributing

`seller/`, `buyer/` and `webhooks/` are generated, so a pull request that edits them would be overwritten by the
next release. Open an issue instead: the fix goes into the API spec or the generator, and every language picks it
up. [CONTRIBUTING.md](CONTRIBUTING.md) explains how to regenerate locally.

## More

- API reference and guides: https://crossly.net/docs
- Other languages: https://github.com/crossly-dev
- TypeScript (Node and browsers): [`@crossly/sdk`](https://github.com/crossly-dev/crossly-sdk); command line: [`@crossly/cli`](https://github.com/crossly-dev/crossly-cli); AI agents: [`@crossly/mcp`](https://github.com/crossly-dev/crossly-mcp)

## License

[MIT](LICENSE)
