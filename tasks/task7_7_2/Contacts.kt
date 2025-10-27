fun main() {
    val contacts = mutableMapOf<String, String>()

    println("Contact Database — type 'exit' to quit.\n")

    while (true) {
        print("Enter contact name: ")
        val name = readLine()?.trim() ?: continue

        if (name.equals("exit", ignoreCase = true)) {
            println("\nExiting program. Goodbye!")
            break
        }

        if (contacts.containsKey(name)) {
            println("${name}'s number is: ${contacts[name]}\n")
        } else {
            print("No number found for '$name'. Enter phone number: ")
            val number = readLine()?.trim()
            if (!number.isNullOrEmpty()) {
                contacts[name] = number
                println("Saved $name → $number\n")
            } else {
                println("Invalid input. Phone number not saved.\n")
            }
        }
    }
}
