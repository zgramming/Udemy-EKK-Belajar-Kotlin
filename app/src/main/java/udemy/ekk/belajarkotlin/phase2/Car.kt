package udemy.ekk.belajarkotlin.phase2

class Car(
    var brandName: String = "Default Brand",
    var merek: String = "Default Merek",
    var year: Int = 2020,
) {

    init {
        println("Running When Class Car is Called : $brandName :: $merek :: $year")
    }

    constructor(brandName: String, merek: String) : this(brandName, merek, 2022) {
        println("Secondary Constructor")
    }

    constructor(brandName: String) : this(brandName, "") {
        println("Third Constructor")
    }


    fun test1(param1: String, param2: String): Boolean {
        if (param1 == "" && param2 == "") return false
        return true
    }
}