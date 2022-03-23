package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.BigNote
import udemy.ekk.belajarkotlin.phase2.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)
    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin V.2")
    println(bigNote.title)
    println(bigNote.bigTitle)
}