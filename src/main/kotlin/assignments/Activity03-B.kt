package assignments

fun main() {

    var item = arrayListOf<String>(
        "Bible",
        "Nature",
        "Literature",
        "World History",
        "World Almanac",
        "Science",
        "Organic Chemistry",
        "Human Anatomy",
        "Human Kinetics",
        "Zoology",
        "Astronomy",
        "Ocean",
        "World Records",
        "Technology",
        "Applied Physics",
        "Advanced Mathematics",
        "Quantum Mechanics",
        "Fluid Dynamics",
        "Colliers Encyclopedia",
        "Webster's Dictionary"
    )

    var returnedItems = mutableListOf<String>()
    var selectedItems = mutableListOf<String>()
    var borrowAnother: String = ""

    var lib = LibraryItems()

    try {
        do {
            //return here if entry is beyond 3
            println()
            println("Main menu:")
            println("(1) Borrow an item\n(2) Return an item\n(3) Cancel the transaction")
            println()
            println("Please select the number of your transaction:")
            var transactionSelect = readln().toInt()
            if (transactionSelect == 1) {
                println()
                println("Available items in the Library are: $item")
                println()
                println("Please select one item to be borrowed:")
                var selectedItem = readln().uppercase()
                selectedItems.add(selectedItem)
                println("You have selected $selectedItem. Do you want to borrow another book? [Y or N]")
                borrowAnother = readln().uppercase()

                do {
                    //return here if the customer wants to borrow another one
                    if (borrowAnother == "Y") {
                        println()
                        println("Available books are $item:")
                        println()
                        println("Please select one item to be borrowed:")
                        selectedItem = readln().uppercase()
                        selectedItems.add(selectedItem)
                        println("You intend to borrow following items: $selectedItems.")
                        println("Do you want to borrow another one?. Please type Y for Yes or N for No.")
                        var yesOrNo1 = readln().uppercase()

                        if (yesOrNo1 == "Y") {
                            println()
                        } else if (yesOrNo1 == "N") {
                            println()
                            lib.borrowed()
                            break
                        } else {
                            println("Invalid input. Choose only Y for Yes or N for No.")
                        }

                    } else if (borrowAnother == "N") {
                        println("Thank you for your transaction.")
                        break
                    } else {
                        println("Invalid response. Please select either Y for Yes of N for No.")
                    }
                } while (borrowAnother !== "N")

                //for return of items
            } else if (transactionSelect == 2) {
                println()
                println("Please type the name of the item you would like to return:")
                var itemForReturn = readln().uppercase()
                returnedItems.add(itemForReturn)
                println()
                println("Successfully entered $returnedItems to be returned!")
                do {
                    println("Do you want to return more items? Please select Y for Yes or N for No.")
                    var yesOrNo = readln().uppercase()
                    if (yesOrNo == "Y") {
                        println("Please type the name of the item you would like to return:")
                        itemForReturn = readln().uppercase()
                        returnedItems.add(itemForReturn)
                    } else if (yesOrNo == "N") {
                        println()
                        println("You intend to return the following item/s $returnedItems.")
                        lib.returned()
                        break
                    } else {
                        println("Incorrect response. Please type either Y for Yes or N for No.")
                    }
                } while (yesOrNo !== "N")

                //if the customer wants to cancel the transaction
            } else if (transactionSelect == 3) {
                println()
                println("The transaction is cancelled.")
                println()
                println("Thank you and come again.")
            } else {
                println()
                println("Incorrect response. Please select 1, 2, or 3.")
            }
        } while (transactionSelect !== 1 && transactionSelect !== 2 && transactionSelect !== 3)
    } catch (e: Exception) {
        println(e.message)
        println("Error occurred! Please input digits only.")
        println()
    }

    isBookInRecord()
    addBook()
    removeBook()
    countBooks()
    searchBookWildSearch()
    searchBookName()
    showBooks()

}

fun showBooks() {

}

fun searchBookName() {

}

fun searchBookWildSearch() {

}

fun countBooks() {

}

fun removeBook() {

}

fun addBook() {

}

fun isBookInRecord() {

}

class LibraryItems (){
    init {
        println("Welcome to the Library!")
    }


    fun borrowed(){
        println("You have borrowed the following items.")
        println("Please bring the printed slip to the counter and wait for the items.")
        println("Thank you for your transaction.")
    }

    fun returned (){
        println("You have returned the following items")
        println()
        println("Please bring the printed slip to the counter together with the items for return.")
        println()
        println("Thank you and come again.")

    }
}