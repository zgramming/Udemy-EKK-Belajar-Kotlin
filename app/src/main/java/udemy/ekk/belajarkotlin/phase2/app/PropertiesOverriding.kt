package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Retangle
import udemy.ekk.belajarkotlin.phase2.Shape
import udemy.ekk.belajarkotlin.phase2.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val retangle = Retangle()
    println(retangle.corner)

    val triangle = Triangle()
    println(triangle.corner)
}