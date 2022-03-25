package udemy.ekk.belajarkotlin.phase2.program

import udemy.ekk.belajarkotlin.phase2.annotations.Fancy

@Fancy(author = "Zeffry")
class MyApplication(
    val name: String,
    val version: Int
){
    fun info():String = "Application $name-$version"
}