package assignments

fun main(){

    var lisOfNames = arrayListOf<String>("Paul", "George", "Wallace", "Simon", "Peter", "Lourdes", "Angel", "Mae", "June", "Ava", "Dave", "Santa", "Luke", "Shaugn", "Euphy", "Ester", "Galadriel", "Sebastian", "Coloniel", "Bartolomew")
    var searchName: String = ""
    var addName: String = ""
    var transaction = readln().toInt()

    println("Choose an option:\n [1] Search name\n, [2] Add a name\n, [3] Delete a name\n")
    if (transaction == 1){
        println("Please enter the name of the student:")
        searchName = readln().toString()
        isStudentInRecord(searchName)
    }else if (transaction == 2){
        println("Please type the name of the student that you want to add:")
        addName = readln().toString()
        addStudent()
    }else if (transaction == 3){

    }else{
        println("Thank you for your transaction. Please try again. ")
    }

}

    fun addStudent() {
    }

    fun isStudentInRecord(names: String):String {
        for(searchName in names) {
            println("$searchName is in record.")
    }
        return names

    }
