fun generateGreeting(name: String?): String {
    // TODO: Обробіть null та порожній рядок. Значення за замовчуванням - "Guest".
    // Поверніть рядок формату "Welcome, Name!"
    if (name.isNullOrEmpty()) return "Welcome, Guest!"
    return "Welcome, ${name}!"
}