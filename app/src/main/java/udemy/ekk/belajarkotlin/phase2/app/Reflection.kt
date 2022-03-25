package udemy.ekk.belajarkotlin.phase2.app

import udemy.ekk.belajarkotlin.phase2.CategoryRequest
import udemy.ekk.belajarkotlin.phase2.ProductRequest
import udemy.ekk.belajarkotlin.phase2.annotations.NotBlank
import udemy.ekk.belajarkotlin.phase2.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    // https://stackoverflow.com/a/60126901/7360353
    val properties = clazz.memberProperties

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> if ("" == value) throw ValidationException("${property.name} is blank")

            }
        }
    }
}

fun main() {
    val request = ProductRequest("1", "", 2000)
    validateRequest(request)

    val rq = CategoryRequest(id = "1", name = "")
    validateRequest(rq)
}