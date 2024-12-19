val towels = towelsBlob.split(", ")
val desiredTowels = desiredPatternsBlob.split("\n")

fun main() {
    val possibleDesignsCount = desiredTowels.sumOf { towelPattern ->
        val possibleCount = countPossibleTowelDesign(towelPattern)
        towelPattern.printPatternPossibility(possibleCount)
        possibleCount
    }
    println("Amount of possible designs: $possibleDesignsCount")
}

private fun String.printPatternPossibility(count: Long) {
    println(
        "$this: ${
            if (count > 0) "Possible ($count)" else "Impossible"
        }"
    )
}

fun countPossibleTowelDesign(towelPattern: String): Long {
    val memo = mutableMapOf<String, Long>()

    fun isTowelPatternMatch(pattern: String): Long {
        if (pattern.isEmpty()) return 1
        memo[pattern]?.let { return it }

        var count = 0L
        for (towel in towels) {
            if (pattern.startsWith(towel)) {
                count += isTowelPatternMatch(pattern.removePrefix(towel))
            }
        }

        memo[pattern] = count
        return count
    }

    return isTowelPatternMatch(towelPattern)
}