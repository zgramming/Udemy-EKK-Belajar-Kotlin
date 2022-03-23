package udemy.ekk.belajarkotlin.phase2

class User(
    var username: String = "",
    var password: String = "",
){
    override fun toString(): String {
        return "User with username = ${this.username} and password = ${this.password}"
    }
}