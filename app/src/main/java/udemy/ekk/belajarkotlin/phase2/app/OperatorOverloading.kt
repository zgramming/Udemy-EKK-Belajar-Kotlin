package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Fruit

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(200)
    val fruit3 = fruit1 + fruit2
    println(fruit3)
    val fruit4 = fruit3 - Fruit(10)
    println(fruit4)
}