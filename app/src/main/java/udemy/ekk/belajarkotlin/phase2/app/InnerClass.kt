package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Boss

fun main(){
    val boss = Boss("Zeffry")
    val employee1 = boss.Employee("Budi")
    val employee2 = boss.Employee("Joko")

    val secondBoss = Boss("Jali")
    val employee3 = secondBoss.Employee("Jainudin")
    val employee4 = secondBoss.Employee("Roni")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}