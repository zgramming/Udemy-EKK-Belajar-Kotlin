package udemy.ekk.belajarkotlin.phase2

sealed class Operation(val name: String)

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Modulo : Operation("Modulo")