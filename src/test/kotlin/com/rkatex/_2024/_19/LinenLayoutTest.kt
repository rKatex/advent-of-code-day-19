package com.rkatex._2024._19

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class LinenLayoutTest {
    private val linenLayout = LinenLayout(towelsBlob, desiredPatternsBlob)

    @Test
    fun `Count number of possible towel patterns for part 1`() {
        val numberOfTowelPatterns = linenLayout.countNumberOfPossibleTowelPatterns()

        assertThat(numberOfTowelPatterns).isEqualTo(285)
    }

    @Test
    fun `Calculate total number of possible towel patterns for part 2`() {
        val totalNumberOfTowelPatterns = linenLayout.calculateNumberOfTowelPatterns()

        assertThat(totalNumberOfTowelPatterns).isEqualTo(636_483_903_099_279L)
    }

}