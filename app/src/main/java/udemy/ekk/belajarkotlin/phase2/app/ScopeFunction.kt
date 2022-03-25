package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Student

fun main() {
    val student = Student("zEFFRY", 15)

    println(student.name)
    println(student.age)

    val result = student.let {
        println(it.name)
        println(it.age)
        "Name ${it.name}, Age ${it.age}"
    }

    println(result)

    val result2 = student.run {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result2)

    val result3 = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4 = student.also {
        println(it.name)
        println(it.age)
        "Name ${it.name}, Age ${it.age}"
    }

    println(result4)

    val result5 = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }

    println(result5)

}
