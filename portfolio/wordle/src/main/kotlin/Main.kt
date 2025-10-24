fun main() {
    println("Welcome to Wordle!")
    println("Try to guess the secret 5-letter word. You have 10 attempts!\n")

    val filename = "data/words.txt"
    val words = readWordList(filename)
    val targetWord = pickRandomWord(words)

    var attempt = 1
    var guessedCorrectly = false

    while (attempt <= 10) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, targetWord)

        println("Result:")
        displayGuess(guess, matches)

        if (guess == targetWord) {
            println("Yay! You guessed it in $attempt attempt(s)!")
            guessedCorrectly = true
            break
        }

        attempt++
    }

    if (!guessedCorrectly) {
        println("Oh No you've lost! You are out of attempts! The correct word was $targetWord.")
    }
}
