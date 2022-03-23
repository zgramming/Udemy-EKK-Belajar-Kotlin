package udemy.ekk.belajarkotlin.phase1

import java.util.*

fun main() {
    val contohLambda: (String, String) -> String = { firstname, lastname ->
        "My Firstname $firstname and my Lastname $lastname"

    }

    val result = contohLambda("zeffry", "reynando")
    println(result)

    /// Lambda Expression [It]
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Zeffry"))

    /// Lambda Expression Method References
    fun toUpper(value: String): String = value.toUpperCase(Locale.ROOT)
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Zeffry Reynando"))
}