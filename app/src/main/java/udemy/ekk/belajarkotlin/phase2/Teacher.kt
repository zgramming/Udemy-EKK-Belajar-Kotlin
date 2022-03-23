package udemy.ekk.belajarkotlin.phase2

open class Teacher(
    val name: String
) {
    fun teach(){
        println("Teach!")
    }

    protected open fun test(){

    }
}


class SuperTeacher(name:String) : Teacher(name){
}