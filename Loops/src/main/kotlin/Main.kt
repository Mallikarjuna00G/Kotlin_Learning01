fun main() {
    println("Loops")
    println("***********************************")

    // including 1 and 10
    for(i in 1..10) {
        println(i)
    }

    // excluding 10
    for(i in 1 until 10) {
        println(i)
    }

    // loop backwards
    for(i in 10 downTo 1 ) {
        println(i)
    }

    // arbitrary steps
    for(i in 1 until 10 step 2) {
        println(i)
    }

    /* while Loop */
    var number: Int = 0
    while(number < 10) {
        println(number)
        number++
    }

    // do-while loop
    do {
        println(number--)
    }while(number > 0)

    // also discussed on the 'continue' keyword
    // also discussed on the 'break' statement

    println("***************label to break out of specific loop************")
    // labels to break out of specific loops
    number = 0
    label1@ while(number < 10) {
        number++
        println(number)

        var i = 0
        while(i < 5) {
            if(i == 3) {
                break@label1    // Breaks out of the outer while loop
            }
            i++
            println("i: $i")
        }
    }
}