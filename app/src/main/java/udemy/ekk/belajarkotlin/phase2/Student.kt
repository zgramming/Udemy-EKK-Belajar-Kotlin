package udemy.ekk.belajarkotlin.phase2

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name} and age is ${this.age}")
    }
}

val Student.uppername : String get() = this.name.toUpperCase(java.util.Locale.ROOT)