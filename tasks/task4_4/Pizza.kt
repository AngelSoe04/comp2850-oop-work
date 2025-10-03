fun main(){
    println("PIZZA MENU\n (a) Margherita\n (b) Quattro Stagioni\n (c) Seafood\n (d) Hawaiian\n")

    var pizzachosen: String
    do{
        print("Choose your pizza (a-d): ")
        pizzachosen = readln().lowercase()
        if(pizzachosen.length != 1 || pizzachosen[0] !in 'a'..'d'){
            println("Invalid Choice Please Try Again!\n")
        }
    }while(pizzachosen.length != 1 || pizzachosen[0] !in 'a'..'d')

    println("Order Accepted!")

}