import java.io.File
import java.util.Base64
import kotlin.system.exitProcess
import net.crossly.webhooks.CrosslyWebhooks

/**
 * Runs the shared conformance vectors against the Kotlin port.
 *
 * Reads the TSV rather than the JSON on purpose, like the Java runner: the JDK has no JSON parser, and adding one
 * would put a second thing that can be wrong into a test whose whole job is to be trustworthy.
 *
 *   bash check-vectors.sh      (compiles this file and CrosslyWebhooks.kt with kotlinc, then runs it)
 */
fun main() {
    var ok = 0
    var bad = 0
    var total = 0
    for (line in File("../test-vectors.tsv").readLines(Charsets.UTF_8)) {
        if (line.isEmpty() || line.startsWith("#")) continue
        val cols = line.split("\t")
        if (cols.size < 6) continue
        val (name, bodyB64, header, secret, now, expect) = cols
        total++
        val body = Base64.getDecoder().decode(bodyB64)
        val got = try {
            CrosslyWebhooks.verify(body, header, secret, 300, now.toLong())
            "ok"
        } catch (e: CrosslyWebhooks.VerificationException) {
            e.reason
        } catch (e: RuntimeException) {
            // Any other throw is itself a conformance failure: a malformed header must be rejected cleanly.
            "threw:${e.javaClass.simpleName}"
        }
        if (got == expect) {
            ok++
        } else {
            bad++
            println("  MISMATCH $name: expected $expect, got $got")
        }
    }
    println("  kotlin: $ok/$total vectors agree")
    exitProcess(if (bad > 0 || total == 0) 1 else 0)
}

private operator fun <T> List<T>.component6(): T = this[5]
