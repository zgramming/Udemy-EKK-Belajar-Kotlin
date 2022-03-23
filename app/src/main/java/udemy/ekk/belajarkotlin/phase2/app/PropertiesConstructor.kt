package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.User

fun main() {
    val user1 = User("username1", "sangat rahasia")

    val user2 = User(username = "zeffry", password = "superadmin")
    println(user1.username)
    println(user1.password)

}
