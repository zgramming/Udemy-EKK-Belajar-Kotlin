package udemy.ekk.belajarkotlin.phase1

fun exampleReturnType(randomNumber: Int = 0): Boolean? {
    if (randomNumber <= 0) return null
    return true
}

fun main() {
    val result = exampleReturnType(100)
    println(result)
}