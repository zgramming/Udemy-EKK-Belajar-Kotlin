package udemy.ekk.belajarkotlin.phase2

import udemy.ekk.belajarkotlin.phase2.annotations.NotBlank

data class ProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
)