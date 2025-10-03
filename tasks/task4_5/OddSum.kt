// Task 4.5: summing odd integers with a for loop
fun main(){
    print("Enter the upper limit: ")
    val input = readln()
    val limit = input.toLongOrNull()

    if (limit == null || limit < 1){
        println("Invalid Input! Only enter positive number")
        return
    }
    var sum = 0L
    for (i in 1..limit step 2){
        sum += i
    }
    println("The sum of odd integers from 1 to $limit is $sum")
}