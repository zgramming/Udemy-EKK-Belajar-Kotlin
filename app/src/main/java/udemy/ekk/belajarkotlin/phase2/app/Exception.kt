package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.exception.ValidationException

fun main() {

    fun validateAndSayHello(name: String) {
        if (name.isBlank()) throw ValidationException("Name is blank")
        println("Hello $name")
    }

    try {
        validateAndSayHello("")
    } catch (e: ValidationException) {
        println("ValidationException ${e.message}")
    } catch (e: Throwable) {
        println("Uncatch Error ${e.message}")
    } finally {
        println("Finishing try catch function")
    }
}