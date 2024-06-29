fun main() {
    println("Kotlin Functions")
    println("**********************************************")

    sayHello()
    sayHello()

    sayHelloTo("Mallikarjuna G", 30)

    val max = getMax(num1 = 20, num2 = 30)
    println("The max value is ${max}")

    val max2 = getMax2(num1 = 80, num2 = 40)
    println("The max value is ${max2}")

    val max4 = getMax2(num1 = 40.1f, num2 = 40.5f)
    println("The max value (Float) is ${max4}")

    val max5 = getMax2(num1 = 40.1, num2 = 40.5)
    println("The max value (Double) is ${max5}")

    val max3 = getMax2(num1 = 30, num2 = 25, num3 = 10)
    println("The max value (out of 3 numbers) is ${max3}")

    println("Sum of the given values: ${sum(12, 34, 56, 67)}")

    println("Sum of the given values: ${sum2(12, 34, 56, 67, 100)}")
}

fun sayHello() {
    println("Hello")
}

// Functions with parameter
// Note that the parameters are immutable
// Scope rules are same as we have seen in C/C++
fun sayHelloTo(name: String, age: Int) {
    println("Hello, ${name}!!! You are ${age} years old???!!!")
}

// Function that returns values
fun getMax(num1: Int, num2: Int): Int {
        val max = if(num1 > num2) {
            num1    // This will be assigned to max variable
        } else {
        num2    // This will be assigned to max variable
        }
    return max
}

fun getMax2(num1: Int, num2: Int) = if(num1 > num2) num1 else num2

// function overloading for Float
fun getMax2(num1: Float, num2: Float) = if(num1 > num2) num1 else num2

// function overloading for Double
fun getMax2(num1: Double, num2: Double) = if(num1 > num2) num1 else num2

// function overloading by number of parameters variation
fun getMax2(num1: Int, num2: Int, num3: Int) =
    if(num1 > num2 && num1 > num3) {
        num1
    }
    else if(num2 > num1 && num2 > num3) {
        num2
    }
    else
        num3


//Concepts of named arguments, default argument values are discussed

// Variable number of arguments
fun sum(vararg numbers: Int): Int {
    var result = 0
    for( number in numbers) {
        result += number
    }
    return result
}

// Variable numer of arguments: Other way of accessing the vararg elements
fun sum2(vararg numbers: Int): Int {
    var result = 0
    numbers.forEach {
        println("Adding ${it}")
        result += it
    }
    return result
}