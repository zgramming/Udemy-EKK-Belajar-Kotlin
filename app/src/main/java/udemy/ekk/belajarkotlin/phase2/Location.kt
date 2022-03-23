package udemy.ekk.belajarkotlin.phase2

abstract class Location(val name: String)

class City(name: String) : Location(name)

class Country(name: String): Location(name)