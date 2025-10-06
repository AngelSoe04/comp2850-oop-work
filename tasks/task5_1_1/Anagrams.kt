// Task 5.1.1: anagram checking using a function
fun anagrams(first:String, second: String):Boolean {
    if(first.length != second.length){
        return false
    }
    val firstChar = first.lowercase().toList().sorted()
    val secondChar = second.lowercase().toList().sorted()
    return firstChar == secondChar
}
fun main(){
    println("Enter the first word:")
    val firstWord = readln()
    println("Enter the second word:")
    val secondWord = readln()

    val result = anagrams(firstWord,secondWord)
    if(result){
        println("These are anagrams")
    }else{
        println("These are not anagrams")
    }
}