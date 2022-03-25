package udemy.ekk.belajarkotlin.phase2

import java.util.*

class Application(val name: String) {
    companion object {
        fun toUpper(name: String): String {
            return name.toUpperCase(Locale.ROOT)
        }
    }
}