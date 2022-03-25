package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Employee
import udemy.ekk.belajarkotlin.phase2.Manager
import udemy.ekk.belajarkotlin.phase2.VicePresident

fun main() {
    var emp = Employee("Zeffry")
    emp.sayHello("Budi")

    emp = Manager("Zeeff")
    emp.sayHello("Budi")

    emp = VicePresident("Zeeeff")
    emp.sayHello("Budi")

}