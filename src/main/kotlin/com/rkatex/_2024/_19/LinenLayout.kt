package com.rkatex._2024._19

class LinenLayout(towelsBlob: String, desiredPatternsBlob: String) {

    private val towels = towelsBlob.split(", ")
    private val desiredTowels = desiredPatternsBlob.split("\n")

    /**
     * Counts the number of towel patterns that are possible with the given Towels
     *
     * Part 1 of Advent of Code
     */
    fun countNumberOfPossibleTowelPatterns(): Int {
        return desiredTowels.count { towelPattern ->
            countPossibleTowelDesigns(towelPattern) > 0
        }
    }

    /**
     * Calculates the total number of possible towel designs for all desired towel patterns.
     *
     * Part 2 of Advent of Code
     */
    fun calculateNumberOfTowelPatterns(): Long {
        return desiredTowels.sumOf { towelPattern ->
            countPossibleTowelDesigns(towelPattern)
        }
    }

    private fun countPossibleTowelDesigns(towelPattern: String): Long {
        val memo = mutableMapOf<String, Long>()

        fun isTowelPatternMatch(pattern: String): Long {
            if (pattern.isEmpty()) return 1
            memo[pattern]?.let { return it }

            val count = towels
                .filter { pattern.startsWith(it) }
                .sumOf { isTowelPatternMatch(pattern.removePrefix(it)) }

            memo[pattern] = count
            return count
        }

        return isTowelPatternMatch(towelPattern)
    }

}
