package com.example.eshopekotlin

object CategoryData {
    fun  getCategory() = listOf<Category>(
        Category(R.drawable.ic_phone_white,"Phones"),
        Category(R.drawable.ic_computer_white, "Computer"),
        Category(R.drawable.ic_health_white, "Health"),
        Category(R.drawable.ic_books, "Books"),
        Category(R.drawable.ic_phone_white,"Phones"),
        Category(R.drawable.ic_computer_white, "Computer"),
        Category(R.drawable.ic_health_white, "Health"),
        Category(R.drawable.ic_books, "Books"),
    )

    fun  getCategoryClick() = listOf<Category>(
        Category(R.drawable.ic_phone_orange,"Phones"),
        Category(R.drawable.ic_computer_orange, "Computer"),
        Category(R.drawable.ic_health_orange, "Health"),
        Category(R.drawable.ic_books_orange, "Books"),
        Category(R.drawable.ic_phone_orange,"Phones"),
        Category(R.drawable.ic_computer_orange, "Computer"),
        Category(R.drawable.ic_health_orange, "Health"),
        Category(R.drawable.ic_books_orange, "Books"),
    )
}