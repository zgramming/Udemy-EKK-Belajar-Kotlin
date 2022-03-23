package udemy.ekk.belajarkotlin.phase2

import java.util.*

class Note(title: String) {

    var title: String = title
        get() {
            println("Getter function called")
            return field
        }
        set(value) {
            println("Setter function called")
            when {
                value.isNotBlank() -> field = value
                else -> field = "kosong"
            }
        }
}

class BigNote(val title:String){
    val bigTitle
        get() = title.toUpperCase(Locale.ROOT)
}