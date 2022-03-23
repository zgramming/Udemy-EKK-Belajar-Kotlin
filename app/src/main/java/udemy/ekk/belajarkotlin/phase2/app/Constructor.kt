package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Car

fun main() {
    val bmw = Car(brandName = "BMW", "Kantor BMW")
    val toyota = Car(brandName = "Toyota", "Honda")
    println(toyota.brandName)
    println(toyota.merek)

    println(bmw.brandName)
    println(bmw.merek)
}