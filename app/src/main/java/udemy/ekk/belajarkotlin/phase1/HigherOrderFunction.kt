package udemy.ekk.belajarkotlin.phase1

import java.util.*

fun main() {
    fun hellow(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val result = hellow(
        "Zeffry",
        transform = { value ->
            val result = "Boys ${value.toUpperCase(Locale.ROOT)}"
            result
        },
    )

    /// Trailing Lambda
    val result2 = hellow(
        "Zeffry",
    ) { value ->
        "Boys ${value.toUpperCase(Locale.ROOT)}"
    }

    println(result)
}