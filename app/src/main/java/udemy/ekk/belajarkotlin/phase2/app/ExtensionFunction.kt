package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Student
import udemy.ekk.belajarkotlin.phase2.sayHello
import udemy.ekk.belajarkotlin.phase2.uppername

fun main() {
    val student = Student("Zeffry", 22)
    student.sayHello("Budi")
    println(student.uppername)

}