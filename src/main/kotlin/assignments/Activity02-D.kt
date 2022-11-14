package assignments

fun main() {

    var numbers = mutableListOf<Int>()
    var addAnother: String = ""
    var divideBy: Int = 0
    var addItem: Int = 0

    try {
        println("Please input the number:")
        addItem = readln().toInt()
        numbers.add(addItem)
    } catch (e: Exception) {
        println(e.message)
        println("Error occurred! Please input digits only.")
        println()
    }

    do{
        try {
            println("Do you want to add another number?")
            addAnother = readln().uppercase()
        }catch (e:Exception){
        println(e.message)
            println("Error occurred! Type Y or N only.")
        }

        if(addAnother == "Y") {
            println("Please input another number:")
            addItem = readln().toInt()
            numbers.add(addItem)
            println("You have entered the following numbers: $numbers")
        }else{
            println("You have entered the following numbers: $numbers")
            break
        }

    }while (addAnother !== "N")

    println("The total amount of the numbers you have inputted is ${numbers.sum()}")
    println("By how much would you like to divide this?")
    divideBy = readln().toInt()

    println("The answer is ${numbers.sum()/divideBy}")

}