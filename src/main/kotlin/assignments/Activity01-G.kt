package assignments

fun main() {
    //variable
    var string: String = ""

    //word entry
    println("Enter a word:")
    string = readln()

    var string1 = string.uppercase()
    var reverse = string1.reversed()

    // palindrome if orignal and reversed are equal
    if (string1 == reverse){
        println("$string is a palindrome.")
    }else{
        println("$string is not a palindrome.")}

}
