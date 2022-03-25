package udemy.ekk.belajarkotlin.phase2.app

data class Friend(val name: String)

fun sayHelllo(friend: Friend?) {
//    if (friend != null) println("Hello ${friend.name}")
    println("Hello ${friend?.name ?: "Default Name"}")
}

fun main() {
    sayHelllo(Friend("Zeffry"))
    sayHelllo(null)
}