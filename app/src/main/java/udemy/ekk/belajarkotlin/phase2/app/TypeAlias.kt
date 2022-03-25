package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Application

typealias  App = Application
typealias  Aplikasi = App

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App(name = "Name")
    val aplikasi = Aplikasi("Name")

    sayHello(supplier = {
        "adadad"
    })
}