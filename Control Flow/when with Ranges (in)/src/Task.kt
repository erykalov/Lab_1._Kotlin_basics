fun getGrade(score: Int): String {
    // TODO: Використайте when (score) { in 90..100 -> "A" ... }
    when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}