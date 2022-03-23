package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Person

fun main() {
    val zeffry = Person()
    zeffry.firstname = "Zeffry"
    zeffry.lastname = "Reynando"

    zeffry.sayHello("Joko")
    zeffry.sayHello("Joko", "Nugroho")

}