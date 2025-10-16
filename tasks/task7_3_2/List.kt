// Task 7.3.2: list element access
fun main(){
    val myList = mutableListOf("Apple", "Orange","Banana", "Pineapple", "Dragonfruit", "Strawberry")
    println("Initial List: $myList")

    myList.add("Grape")
    println("List after adding: $myList")

    myList.add(2, "Avocado")
    println("Index specified adding: $myList")

    val anotherList = listOf("Elderberry", "Fig")
    myList.addAll(anotherList)
    println("After adding all: $myList")

    myList.remove("Banana")
    println("List after removing: $myList")

    val elementsToremove = listOf("Pineapple, Avocado")
    myList.removeAll(elementsToremove)
    println("List after removing specific elements: $myList")

    myList.removeAt(0)
    println("After removing at 0: $myList")

    myList.clear()
    println("List after clearing: $myList")

}