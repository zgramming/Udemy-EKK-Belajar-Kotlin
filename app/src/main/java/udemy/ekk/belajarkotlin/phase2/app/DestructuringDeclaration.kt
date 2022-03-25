package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Game
import udemy.ekk.belajarkotlin.phase2.Login
import udemy.ekk.belajarkotlin.phase2.MinMax


fun main() {
    fun minmax(val1: Int, val2: Int): MinMax {
        return when {
            val1 > val2 -> MinMax(val2, val2)
            else -> MinMax(val1, val2)
        }
    }

    fun login(login:Login,callback:(Login)->Boolean): Boolean {
        return callback(login)
    }

    val game = Game("Game Kotlin", 200_000)
    val (name, price) = game
    println(name)
    println(price)

//    val result = minmax(10,100);
//    val min = result.min
//    val max = result.max
    val (min,max) = minmax(10,100);
    println(min)
    println(max)

    val login = Login("zeffry","rahasia");
//    login(login) { lg ->
//        lg.user =="zeffry" && lg.password == "rahasia";
//    }
    login(login) { (user, password) ->
        user == "zeffry" && password == "rahasia"
    }

}