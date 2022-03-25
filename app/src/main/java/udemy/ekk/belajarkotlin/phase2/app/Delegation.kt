package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.MyBase
import udemy.ekk.belajarkotlin.phase2.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Zeffry")

    val baseDelegate = MyBaseDelegate(base = base)
    baseDelegate.sayHello("Joko")

}