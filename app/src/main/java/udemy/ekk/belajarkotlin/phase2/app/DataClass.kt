package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")
    println(product.toString())
    val product2 = product.copy(name = "Jasjus")
    println(product2)
}