fun main() {
    val text: String? = null

    println("$text")
    println("Length of the string: ${text?.length}")

    val text2: String? = "Mallikarjuna G"
    println("${text2}")
    println("Length of the string: ${text2?.length}")

//    println("Length of the string: ${text2.length}")    // Throws error

//    But if we do check for null condition and then access, we will not get error
    if(text2 != null) {
        println("Printing length inside if condition: ${text2.length}")
    }
    else {
        println("Variable is null")
    }

//    ?. safe call operator
//    !!. non-nullable operator

//    ?: - Elvis (Elvis Presley) operator
    var text3: String? = null

//    If text3 is not null assign text3 otherwise assign the provided string
    var text4: String = text3 ?: "The variable is null"

    println("text4: ${text4}")

    text3 = "Mallikarjuna G"
    //    If text3 is not null assign text3 otherwise assign the provided string
    text4 = text3 ?: "The variable is null"

    println("text4: ${text4}")

//    The longer version of this elvis presley operation is using if-else condition checking for null

}