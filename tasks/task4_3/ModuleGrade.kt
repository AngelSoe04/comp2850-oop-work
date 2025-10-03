fun main(){
    println("Enter the first mark: ")
    val mark1 = readln().toFloat()

    println("Enter the second mark: ")
    val mark2 = readln().toFloat()

    println("Enter the third mark: ")
    val mark3 = readln().toFloat()

    val average = ((mark1+mark2+mark3)/3.0).toInt()
    val grade = when (average){
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> {
            println("Invalid marks Input!")
            return
        }
    }
    println("Average Marks: $average")
    println("Grade: $grade")
}