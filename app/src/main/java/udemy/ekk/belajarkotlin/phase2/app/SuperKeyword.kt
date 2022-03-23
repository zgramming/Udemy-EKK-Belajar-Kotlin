package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Retangle

fun main() {
    val retangle = Retangle()
    println("Corner ${retangle.corner} | Parent Corner ${retangle.parentCorner}")
    retangle.printName()
}