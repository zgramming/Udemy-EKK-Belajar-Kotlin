package udemy.ekk.belajarkotlin.phase1

fun String.imHandsome(): String {
    return "Kamu sangat ganteng $this"
}

fun main() {
    val result = "Zeffry".imHandsome()
    println(result)
}