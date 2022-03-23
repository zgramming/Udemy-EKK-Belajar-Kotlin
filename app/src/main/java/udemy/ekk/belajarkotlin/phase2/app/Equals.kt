package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Company

fun main() {
    val company1 = Company("1")
    val company2 = Company("2")

    println(company1 == company2)
    println(company2 == company1)
    println(company1 == company1)
    println(company2 == company2)

    println("${company1.hashCode()} == ${company2.hashCode()}")
    println(company1.hashCode() == company2.hashCode())
}