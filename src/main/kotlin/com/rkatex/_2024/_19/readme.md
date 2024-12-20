# Advent of Code 2024 - Day 19

This folder contains my solution for [**Advent of Code 2024 - Day 19**](https://adventofcode.com/2024/day/19).

## How It Works
The solution:

1. Splits a predefined list of towel designs (towelsBlob) and patterns (desiredPatternsBlob) into collections.
2. For each desired pattern, recursively calculates the possible combinations of towels that can form the pattern.
3. Utilizes a memoization technique to optimize the pattern matching process.