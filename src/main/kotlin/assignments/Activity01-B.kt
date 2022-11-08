package assignments

fun main(){
    println()
    var instruction1 : String = "Items in this Library:"
    var item1 : String = "Encyclopedia"
    var characteristic1 : String = "will give you introductory information to help you broaden or narrow your topic, while also providing keywords and terms needed to conduct further research."
    var item2 : String = "Magazine"
    var item3 : String = "Newspaper"
    var item4 : String = "Audio Book"
    var item5 : String = "CD"

    println("$instruction1")
    println("Library Item 1: $item1")
    println("Library Item 2: $item2")
    println("Library Item 3: $item3")
    println("Library Item 4: $item4")
    println("Library Item 5: $item5")

    println()
    //availability
    var itemCopy1 : Int = 5
    var itemCopy2 : Int = 0
    var itemCopy3 : Int = 0
    var itemCopy4 : Int = 0
    var itemCopy5 : Int = 0

    //status
    var itemAvail1 : Boolean = itemCopy1 > 0
    var itemAvail2 : Boolean = itemCopy2 > 0
    var itemAvail3 : Boolean = itemCopy3 > 0
    var itemAvail4 : Boolean = itemCopy4 > 0
    var itemAvail5 : Boolean = itemCopy5 > 0

    println("$item1 is currently available. $itemAvail1")
    println("$item2 is currently available. $itemAvail2")
    println("$item3 is currently available. $itemAvail3")
    println("$item4 is currently available. $itemAvail4")
    println("$item5 is currently available. $itemAvail5")

    println()

    println("Which item you want to borrow?")
    var prompt : String = readln()
    println()
    println("$prompt $characteristic1")
    println()
    println("Are you sure you want to borrow this item?")
    var prompt2 : String = readln()
    println()
    println("You have confirmed to borrow $prompt. Please get your slip and proceed to the counter.")
    println()

    //note: selection of items not yet limited to encyclopedia for the moment and answer is limited to Yes. :)
}