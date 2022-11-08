package assignments

fun main() {

    //first variables
    var integer1: Int = 0
    var integer2: Int = 0

    //entry of integers
    println("Enter the first whole number:")
    integer1 = readln().toInt()

    println("Enter the second whole number:")
    integer2 = readln().toInt()

    //Bigger or lower value?
    if (integer1 > integer2) {
        println("Bigger value: $integer1, Lower value:$integer2")
    } else {
        println("Bigger value: $integer2, Lower value: $integer1")
    }
    println()

    //variable for the prime numbers
    var prime = mutableListOf<Int>()

    if(isPrimeNumber(integer1) == true){
        //add to prime mutable list
        prime.add(integer1)
    }else{
        println("$integer1 is not a prime number.")

    }
    println()
    if(isPrimeNumber(integer2) == true){
        //add to prime mutable list
        prime.add(integer2)

    }else{
        println("$integer2 is not a prime number.")
    }

    println("Prime numbers in ascending order:")
    println(prime.sorted())

}

//new class: prime number decision
fun isPrimeNumber(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false}
    }
    return true
}
