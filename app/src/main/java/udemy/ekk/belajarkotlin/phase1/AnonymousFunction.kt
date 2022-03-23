package udemy.ekk.belajarkotlin.phase1

import udemy.ekk.belajarkotlin.utils.sayHello
import java.util.*

fun main() {

    fun hello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value.isEmpty()) return "Upps"
        return value.toUpperCase(Locale.ROOT)
    }

    println(hello("Zeffry", upper))
    println(hello("", upper))
    println(hello("Reynnado", fun(value:String):String{
        return value.toLowerCase(Locale.ROOT)
    }))
}