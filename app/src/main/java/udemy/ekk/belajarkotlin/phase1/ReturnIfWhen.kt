package udemy.ekk.belajarkotlin.phase1

fun main() {
    fun sayHello(value: String): String {
        return if (value == "") {
            "Kosong"
        } else {
            "Ada Isinya $value"
        }
    }

    fun sayHello2(value: String): String {
        return when (value) {
            "" -> "Kosong"
            else -> "Ada Isinya $value"
        }
    }

    println(sayHello("Zeffry Reynando"))
    println(sayHello2("Reynnado Zeffry"))
}