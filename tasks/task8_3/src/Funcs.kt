// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
  return listOf(
    "Leeds" to 12.3,
    "London" to 10.5,
    "Bristol" to 14.1,
    "London" to 15.8,
    "Glasgow" to 8.9,
    "Cardiff" to 13.4
  )  
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
