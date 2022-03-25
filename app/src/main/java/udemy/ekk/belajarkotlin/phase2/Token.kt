package udemy.ekk.belajarkotlin.phase2

import java.util.*

inline class Token(val value: String) {
    fun toUpper(): String = value.toUpperCase(Locale.ROOT)
}