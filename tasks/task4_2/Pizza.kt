fun main(){
    println("PIZZA MENU\n (a) Margherita\n (b) Quattro Stagioni\n (c) Seafood\n (d) Hawaiian\n")
    print("Choose your pizza (a-d): ")
    val pizzachosen = readln().lowercase()

    if(pizzachosen.length ==1 && pizzachosen[0] in 'a'..'d'){
        println("Order Accepted!")
    }else{
        println("Invalid Choice!")
    }

}