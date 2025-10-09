// Task 5.3.2: dice rolling simulation

import kotlin.random.Random

fun rollDice(sides: Int = 6, dice: Int = 1) {
    if (sides !in setOf(4, 6, 8, 10, 12, 20)) {
        println("Error: cannot have $sides-sided dice")
        return
    }

    var total = 0
    println("Rolling $dice d$sides...")

    for (i in 1..dice) {
        val result = Random.nextInt(1, sides + 1)
        println("Dice $i rolled $result")
        total += result
    }

    println("Total score: $total")
    println()
}

fun main() {
    rollDice(6, 3)
    rollDice(dice = 2, sides = 8)  
    rollDice(12)    
    rollDice(dice = 4)
    rollDice()       
}
