package assignments

fun main() {

    println("Welcome to the Library Portal.")
    println()

    //Array list
    var books = arrayListOf<String>("Mathematics", "Science", "Comic Books", "Newspaper")
    var fullName = arrayListOf<String>()
    var dateNow = arrayListOf<String>()

    while (true) {
        //user details
        println("---Fill up this form:")
        print("Enter Full Name:")
        var input1 = readln().toString()
        fullName.add(input1)
        print("Enter date today (mm/dd/yyyy):")
        var input2 = readln().toString()
        dateNow.add(input2)
        while (true) {
            //Main menu
            println("This is the Main Menu.")
            print("[1]Books\n[2]Borrow a Book\n[3]Return Books\n[4]Exit\nSelect:")
            var select = readln().toString()
            //check the conditions
            if (select.length > 1) {
                println("Invalid Input/Out of Range")
                break
            } else if (select.toInt() == 1) {
                println("---Books--")
                var counter = 0
                for (i in books) {
                }
            }
        }

    }
}