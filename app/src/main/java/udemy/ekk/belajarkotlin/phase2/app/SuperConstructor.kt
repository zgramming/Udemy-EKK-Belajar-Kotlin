package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.ExecutiveCustomer
import udemy.ekk.belajarkotlin.phase2.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Zeffry")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Reynando", 100000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}