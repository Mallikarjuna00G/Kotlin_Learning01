fun main() {
    println("Arrays")
    hr_line()

    var names: Array<String> = arrayOf("Mallikarjuna", "Shivayya", "Krishnayya")

    println(names[0])

    println("Size of the array names is ${names.size}")

    for(name in names) {
        println(name)
    }

    // Can have an array of mixed data type elements
    val arr1 = arrayOf(1, 2, 3, "India", "Pakistan", "France")

    for(item in arr1) {
        println(item)
    }

    println("printing only integers out of the mixed data type array")
    for(item in arr1) {
        if(item is Int) {
            println(item)
        }
    }
}

fun hr_line() {
    println("***********************************")
}