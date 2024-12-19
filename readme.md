# Advent of Code - Towel Design

This project is a Kotlin-based solution to day 19 from **Advent of Code 2024**, which calculates the number of possible towel designs based on given patterns.

### Example Output:
```plaintext
Pattern1: Possible (2)
Pattern2: Impossible
...
Amount of possible designs: XX
```

## How It Works

The solution:
1. Splits a predefined list of towel designs (`towelsBlob`) and patterns (`desiredPatternsBlob`) into collections.
2. For each desired pattern, recursively calculates the possible combinations of towels that can form the pattern.
3. Utilizes a memoization technique to optimize the pattern matching process.
4. Prints the result for each pattern and a total count of possible designs.

## Setup and Usage

1. **Clone the Repository:**
   ```bash
   git clone <repository_url>
   ```
2. **Run the Program:**
   Use Gradle to build and execute the `main()` function in `Main.kt`. You can do this with:
   ```bash
   ./gradlew run
   ```
3. Modify the input values (`towelsBlob` and `desiredPatternsBlob`) in `Data.kt` as needed.

## Requirements

- **Kotlin**: Version 1.9+ (compatible with current Gradle configuration).
- **Gradle**: The project uses `build.gradle.kts` for dependency management.

## Contributing

Feel free to fork the repository, create a branch, and open a pull request with improvements or alternative solutions.