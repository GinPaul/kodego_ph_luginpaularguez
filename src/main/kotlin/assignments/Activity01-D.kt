package assignments

fun main() {

    var num1: Int = 0

    //try catch for invalid input
    try {
        println("Please enter an amount:")
        num1 = readln().toInt()
    } catch (e: NumberFormatException) {
        println(e)
        println("Invalid input. Try again.")
        println()
    }

    var inputText: String = ""
    var num2: Int = 0
    var total: Int = num1 + num2

    //amount entry and operation loop
    do {
        println("Do you want to add an amount?")
        println("Please enter Y for Yes and N for No:")
        inputText = readln().uppercase()

        //try catch here
        if (inputText == "Y") {
            do {
                try {
                    println("Enter the amount:")
                    num2 = readln().toInt()
                    total += num2
                } catch (e: NumberFormatException) {
                    println(e)
                    println("Invalid input. Try again.")
                    println()
                }
            } while (false)
            println("The amount you entered is $num2")
            println("The total amount you entered is $total.")

        } else if (inputText == "N") {
            println("The total amount you entered is $total")

            println("Divide the amount by how many?")
            var divisor: Int = readln().toInt()

            var finalAmount: Int = total / divisor
            println("The resulting amount is $finalAmount")
            break
        } else
            println("Invalid input. Please try again.")

    } while (inputText !== "N")

    //end
    println()
    println("Thank you for using the service.")
}