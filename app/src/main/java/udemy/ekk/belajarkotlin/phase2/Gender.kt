package udemy.ekk.belajarkotlin.phase2

enum class Gender(val description:String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription(){
        println(description)
    }
}