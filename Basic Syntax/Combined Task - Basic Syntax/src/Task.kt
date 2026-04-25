fun calculateDiscount(): String {
    // TODO: Оголосіть item, price. Зменште price та поверніть відформатований рядок.
    val item = "Laptop"
    val price = 1000
    return "Price of ${item} is ${price.minus(150)}"
}