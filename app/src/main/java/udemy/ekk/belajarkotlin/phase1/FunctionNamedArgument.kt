package udemy.ekk.belajarkotlin.phase1

fun fullname(
    firstname: String,
    middlename: String,
    lastname: String,
): String {
    return "Hello $firstname $middlename $lastname"
}


fun main() {
    /// Named Argument
    println(fullname(lastname = "Ganteng", middlename = "Reynando", firstname = "Zeffry"))

    /// Mixed Named & Positional Argument
    println(
        fullname(
            "Zeffry",
            lastname = "Ganteng",
            middlename = "Reynando"
        )
    )
}