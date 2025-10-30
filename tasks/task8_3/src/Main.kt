// Task 8.3: weather station temperature analysis program

fun main() {
    val dataset = fetchData()

    val lowest = dataset.minByOrNull { it.second }
    val highest = dataset.maxByOrNull { it.second }

    println("Lowest temperature recorded: ${lowest?.first}°C in ${lowest?.second}")
    println("Highest temperature recorded: ${highest?.first}°C in ${highest?.second}")

    val avg = averageTemp(dataset)
    println("Average temperature: %.2f°C".format(avg))
}

