// Task 5.1.1: anagram checking using a function

infix fun String.anagramOf(other: String): Boolean {
    if (this.length != other.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    println("Enter the first word:")
    val firstWord = readln()
    println("Enter the second word:")
    val secondWord = readln()


    if (secondWord anagramOf firstWord) {
        println("$firstWord and $secondWord are anagrams!")
    } else {
        println("$firstWord and $secondWord are not anagrams.")
    }
}
