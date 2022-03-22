package udemy.ekk.belajarkotlin.phase1

infix fun String.to(value: String): String {
    if (value == "UP") return this.toUpperCase()
    else return this.toLowerCase()
}


fun main() {
    val result = "Zeffry" to "UP"
    println(result)
}