package udemy.ekk.belajarkotlin.phase1

fun calculateTotal(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
    val total = calculateTotal(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Totalnya : $total")
}