package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Minus
import udemy.ekk.belajarkotlin.phase2.Modulo
import udemy.ekk.belajarkotlin.phase2.Operation
import udemy.ekk.belajarkotlin.phase2.Plus

fun operation(val1: Int, val2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> val1 + val2
        is Minus -> val1 - val2
        is Modulo -> val1 % val2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 10, Minus()))
    println(operation(10, 10, Modulo()))
}