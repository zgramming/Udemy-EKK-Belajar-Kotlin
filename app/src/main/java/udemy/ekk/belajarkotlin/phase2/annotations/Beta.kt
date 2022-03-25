package udemy.ekk.belajarkotlin.phase2.annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention()
@MustBeDocumented
annotation class Beta

class ExampleBeta(
    @field:Beta val firstname: String,
    @get:Beta val middlename: String,
    @param:Beta val lastname: String
)