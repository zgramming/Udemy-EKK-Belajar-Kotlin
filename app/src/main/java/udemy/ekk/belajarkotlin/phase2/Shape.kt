package udemy.ekk.belajarkotlin.phase2

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is Shape")
    }
}

class Retangle : Shape() {
    override val corner: Int = 4
    val parentCorner = super.corner
    override fun printName() {
        println("This is Retangle")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner: Int = 3
}