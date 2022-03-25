package udemy.ekk.belajarkotlin.phase2

import kotlin.properties.Delegates

class Account(description: String = "") {
    val name: String by lazy {
        println("Name is called")
        "zeffry lazy"
    }

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}