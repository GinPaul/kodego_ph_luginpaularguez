package assignments

//global variables declaration
var optionSelection: Int = 0
var categorySelect: Int = 0
var categorySelectForInvUpdate: Int = 0
var itemNameEntry: String = ""
var itemQtyEntry: Int = 0
var itemNameToUpdateNoodles: String =""
var itemQuantityUpdateNoodles: Int = 0
var noodles = mutableMapOf("Lucky Me Beef" to 3, "Lucky Me Pancit Canton" to 5, "Nissin Cup Noodles" to 10)
var noodlesInventory = mutableListOf(3,5,9)
var freshVegetables = mutableListOf("Alugbati", "Okra", "Squash")
var freshVegInventory = mutableListOf(4,5,6)
var nonFood = mutableListOf("Surf Sunfresh Powder", "Zonrox Bleach Original", "Downy Antibac")
var nonFoodInventory = mutableListOf(10,20,50)

fun main() {

    println("Welcome to the grocery store!")
    println()
    println("Choose option:")
    println("[1] Show list of available items")
    println("[2] Add items to inventory")
    println("[3] Update the inventory count")
    println("[4] Exit")
    println()
    println("NOTE: PLEASE FOCUS ON ADDING ITEMS TO THE INVENTORY FOR THI ACTIVITY.")
    println("PLEASE CHOOSE ONLY [2] Add items to inventory")
    println()

    do {
        println("Please select an option:")
        optionSelection = readln().toInt()

        if (optionSelection == 1) {
            println("Noodles:")
            println("$noodles")

            println("Fresh Vegetables:")
            println("$freshVegetables")

            println("Non-food items:")
            println("$nonFood")
        } else if (optionSelection == 2) {
            println("Please choose which category you want to add inventory:")
            println("[1] Noodles")
            println("[2] Fresh Vegetables")
            println("[3] Non Food Items")
            categorySelect = readln().toInt()

            if (categorySelect == 1) {
                println("Running inventory:")
                println(noodles)
                println("Please type the name of the item that you want to add to inventory:")
                itemNameEntry = readln()
                println("Please enter a number in pieces:")
                itemQtyEntry = readln().toInt()
                noodles[itemNameEntry] = itemQtyEntry


                println("The item $itemNameEntry with quantity $itemQtyEntry has been added to the inventory.")
                println("The updated inventory of is $noodles.")

            } else if (categorySelect == 2) {
                println(freshVegetables)
            } else if (categorySelect == 3) {
                println(nonFood)
            } else
                println("Invalid entry. Try again.")

        } else if (optionSelection == 3) {
            println()
            println("Please choose which category you want to add inventory:")
            println("[1] Noodles")
            println("[2] Fresh Vegetables")
            println("[3] Non Food Items")
            categorySelectForInvUpdate = readln().toInt()

            if (categorySelectForInvUpdate == 1) {
                println("Please type the name of the item to update:")
                itemNameToUpdateNoodles = readln()
                println("Please input the updated quantity:")
                itemQuantityUpdateNoodles = readln().toInt()
                noodles[itemNameToUpdateNoodles] = itemQuantityUpdateNoodles

                println("The item $itemNameToUpdateNoodles with quantity $itemQuantityUpdateNoodles has been added to the inventory.")
                println("The updated inventory is $noodles.")
            } else if (categorySelectForInvUpdate == 2) {
                println()
            }
        }else
            println()
        println("Invalid input! Please try again.")
        println("Choose option:")
        println("[1] Show list of available items")
        println("[2] Add items to inventory")
        println("[3] Update the inventory count")
        println("[4] Exit")

    }while (optionSelection !== 1 && optionSelection !== 2 && optionSelection !== 3 && optionSelection !== 4)


    println("Thank you for using the service.")
}
