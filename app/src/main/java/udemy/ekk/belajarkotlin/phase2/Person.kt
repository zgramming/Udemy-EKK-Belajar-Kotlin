package udemy.ekk.belajarkotlin.phase2

class Person {
    var firstname: String = "Zeffry"
    var middlename: String = "Ganteng"
    var lastname: String = "Reynando"

    fun sayHello(name: String) {
        println("Hello $name my name is ${this.firstname}")
    }

    fun sayHello(firstname: String, lastname: String) {
        println("Hello $firstname $lastname my name is ${this.firstname}")
    }

    fun run() {
        println("I'm run !!!")
    }

    fun getFullName(): String {
        return "$firstname $middlename $lastname"
    }


}