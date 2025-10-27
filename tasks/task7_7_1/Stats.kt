fun readData()= buildList<Double>{
    println("Enter numbers (type 'done' to finish):")
    while(true){
        print("<")
        val input = readLine()?: break
        if(input.lowercase() == "done") break
        val number = input.toDoubleOrNull()

        if (number != null){
            add(number)
        } else {
            println("Invalid input. Please enter a valid number or 'done' to finish.")
        }
    }
}

fun median(values: List<Double>): Double{
    if(values.isEmpty()) return 0.0
    val sorted = values.sorted()
    val mid = sorted.size / 2
    return if(sorted.size % 2 == 0){
        (sorted[mid - 1] + sorted [mid]) / 2
    } else {
        sorted [mid]
    }
}

fun displayStatistics(values: List<Double>){
    if(values.isEmpty()){
        println("No data to display statistics.")
        return
    }
    val mean = values.average()
    val min = values.min()
    val max = values.max()
    val med = median(values)

    println("Statistics:")
    println("Count: ${values.size}")
    println("Minimum: $min")
    println("Maximum: $max")
    println("Mean: $mean")
}

fun main(){
    val data = readData()
    displayStatistics(data)
}