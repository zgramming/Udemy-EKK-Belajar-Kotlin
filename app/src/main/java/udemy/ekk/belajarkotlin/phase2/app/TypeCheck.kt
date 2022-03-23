package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Handphone
import udemy.ekk.belajarkotlin.phase2.Laptop
import udemy.ekk.belajarkotlin.phase2.Smartphone

fun printObject(any: Any) {
    return when (any) {
        is Laptop -> println("This is Laptop ${any.name}")
        is Handphone -> println("This is Handphone ${any.name}")
        is Smartphone -> println("This is Smartphone ${any.name} with OS ${any.os}")
        else -> println("Another Class $any")
    }
}

fun printString(any: Any) {
//    val value = any as String
    val valueNullable = any as? String
//    println("value $value")
    println("valueNullable $valueNullable")
}

fun main() {
    val result = if ("zeffry" === "ZEFFRY") "Aku Ganteng" else "Dia Ganteng"
    println(result)
    printObject("Zeffry")
    printObject(1000)
    printObject(false)
    printObject(Laptop("Asus"))
    printObject(Handphone("Samsung"))

    printString("Zeffry")
    /// Error ClassCastException
    printString(111);
}