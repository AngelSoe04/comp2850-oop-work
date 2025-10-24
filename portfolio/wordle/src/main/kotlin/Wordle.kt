import java.io.File
import kotlin.random.Random

var progressDisplay = MutableList(5) {'?'}

fun isValid(word: String): Boolean{
    return word.length == 5 && word.all{ it.isLetter()}
}

fun readWordList(filename: String): MutableList<String>{
    val words = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String{
    val index = Random.nextInt(words.size)
    val word = words.removeAt(index)
    return word
}

fun obtainGuess(attempt: Int): String{
    while(true){
        println("Attempt $attempt:")
        var guess = readlnOrNull() ?: ""
        guess = guess.uppercase()

        if(isValid(guess)){
            return guess
        }else {
            println("Invalid word. Please only enter 5-letter words!")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int>{
    
    val matches = MutableList(5) {0}
    val targetLetters = target.toMutableList()

    for(i in 0 until 5){
        if(guess[i] == target[i]){
            matches[i] = 2
            targetLetters[i] = '*'
        }
    }
    for (i in 0 until 5){
        if(matches[i] == 0 && targetLetters.contains(guess[i])){
            matches[i] = 1
            targetLetters[targetLetters.indexOf(guess[i])] = '*'
        }
    }
    return matches
}

fun displayGuess(guess: String, matches: List<Int>) {
    for (i in 0 until 5) {
        if (matches[i] == 2) {
            progressDisplay[i] = guess[i] 
        }
    }
    println(progressDisplay.joinToString("")) 

    for (i in 0 until 5) {
        when (matches[i]) {
            2 -> println("Position ${i + 1}: Letter \"${guess[i]}\" is correct and in the right position")
            1 -> println("Position ${i + 1}: Letter \"${guess[i]}\" is in the word but in the wrong position")
            0 -> println("Position ${i + 1}: Letter \"${guess[i]}\" is not in the word")
        }
    }
    println()
}