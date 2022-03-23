package udemy.ekk.belajarkotlin.phase1

fun main() {
    var counter: Int = 0
    val lambdaIncrement: () -> Unit = {
        println("Increment $counter to ${counter + 1}")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Increment $counter to ${counter + 1}")
        counter++
    }

    fun functionIncrement() {
        println("Increment $counter to ${counter + 1}")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println("Current Counter $counter")

}