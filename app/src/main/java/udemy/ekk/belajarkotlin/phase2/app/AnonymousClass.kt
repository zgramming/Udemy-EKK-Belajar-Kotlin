package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.Action

fun fireAction(action: Action) {
    action.action()
}

fun main() {
    fireAction(object : Action {
        override fun action() {
            println("Anonymous called 1")
        }
    })

    fireAction(object : Action {
        override fun action() {
            println("Anonymous called 2")
        }
    })
}