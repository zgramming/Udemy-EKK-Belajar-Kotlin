package udemy.ekk.belajarkotlin.phase1

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello2(firstname: () -> String, noinline lastname: () -> String): String {
    return "Hello Boys ${firstname()} ${lastname()}"
}

fun main() {
    for (i in 1..100) {
        println(
            hello2(
                firstname = { "Zeffry Reynando" },
                lastname = { "Ganteng Sekali" },
            )
        )
    }
//    println(hello { "Zeffry Reynando" })
}
