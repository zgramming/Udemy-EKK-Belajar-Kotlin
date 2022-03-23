package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Person

fun main() {

    val zeffry = Person()
    zeffry.firstname = "Zeffry"
    zeffry.middlename = "Ganteng"
    zeffry.lastname = "Sekali"

    zeffry.sayHello("Joko")
    zeffry.run()
    val fullname = zeffry.getFullName()
    println(fullname)
}