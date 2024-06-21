package applicationWithRecipes

class Dish(
    val id: Int, 
    val name: String, 
    val category: String, 
    val ingredients: List<String>, 
    val inFavorites: Boolean = false, 
) {
}
