private val id: String? = null
private val name: String? = null
private const val quantity = 0
private val category: String? = null

fun GroceryItem() {
}

fun GroceryItem(id: String, name: String, quantity: Int, category: String) {
    this.id = id
    this.name = name
    this.quantity = quantity
    this.category = category
}

fun getId(): String? {
    return id
}

fun setId(id: String) {
    this.id = id
}

fun getName(): String? {
    return name
}

fun setName(name: String) {
    this.name = name
}

fun getQuantity(): Int {
    return quantity
}

fun setQuantity(quantity: Int) {
    this.quantity = quantity
}

fun getCategory(): String? {
    return category
}

fun setCategory(category: String) {
    this.category = category
}

fun toString(): String {
    return "GroceryItem{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", quantity=" + quantity +
            ", category='" + category + '\'' +
            '}' + "\n"
}