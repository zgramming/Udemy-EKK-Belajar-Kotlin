package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Gender

fun main() {
    val male = Gender.MALE
    val female = Gender.FEMALE
    val all = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    println(manFromString)

    male.showDescription()
    female.showDescription()
}