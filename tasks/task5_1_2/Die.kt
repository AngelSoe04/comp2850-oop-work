// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int){
    if(sides in setOf(4,6,8,10,12,20)){
        println("Rolling a d$sides")
        val result = Random.nextInt(1, sides+1)
        println("You rolled $result")
    }else{
        println("Error: cannot have $sides - sided dice")
    }
}

fun readInt(prompt: String): Int{
    print(prompt)
    val input = readLine()
    if(input != null){
        return input.toInt()
    }else{
        println("No Input Given!!!")
        return 0
    }
}

fun main(){
    rollDie(6)
    rollDie(12)
    rollDie(5)
    rollDie(8)

    val user = readInt("Enter the number of dice sides:")
    println(rollDie(user))
}