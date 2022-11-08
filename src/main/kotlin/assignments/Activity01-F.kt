package assignments

fun main() {

    //given variables
    var string1: String = ""
    var string2: String = ""
    var uniqueString1: String = ""
    var uniqueString2: String = ""
    var countDuplicate: Int = 0
    var stringCount1: Int = 0
    var stringCount2: Int = 0

    //type the words
    println("Enter String 1:")
    string1 = readln()

    println("Enter String 2:")
    string2 = readln()

    stringCount1 = string1.length
    stringCount2 = string2.length

    //Unique characters in string1
    var ctr1: Int = 0
    while (ctr1 < stringCount1) {
        var ctr2: Int = 0
        countDuplicate = 0
        while ((ctr2 < stringCount2) && (countDuplicate == 0)) {

            if (string1[ctr1] == string2[ctr2]) {
                countDuplicate++
            }
            ctr2++

        }
        if (countDuplicate == 0) {
            if (!uniqueString1.contains(string1[ctr1])) {
                uniqueString1 += string1[ctr1]
            }
        }
        ctr1++

        //Unique characters in string2

        while (ctr2 < stringCount2) {
            var ctr1: Int = 0
            countDuplicate = 0
            while ((ctr1 < stringCount1) && (countDuplicate == 0)) {

                if (string2[ctr2] == string1[ctr1]) {
                    countDuplicate++
                }
                ctr1++

            }
            if (countDuplicate == 0) {
                if (!uniqueString2.contains(string2[ctr2])) {
                    uniqueString2 += string2[ctr2]
                }
            }
            ctr2++
        }

        println("Unique characters in string 1 and 2: $uniqueString1$uniqueString2")



    }
}