package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Laptop
import udemy.ekk.belajarkotlin.phase2.Smartphone

fun main() {
    val smartphone = Smartphone("Samsung S10", "Android")
    println(smartphone.equals(Laptop("Samsung S10")))
}