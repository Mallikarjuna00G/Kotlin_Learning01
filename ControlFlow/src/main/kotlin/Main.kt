fun main() {
    val alarm = 12

//    Control flow: when
    when(alarm) {
        12, 7, 14 -> println("The time is ${alarm}")
        in 25 .. 35 -> println("In the range of 25 to 35")
        else -> println("The time is ${alarm}")

    }

//    Control flow: when : as in expression
    val expr1 = when(alarm) {
        12 -> {
            println("statement1")
            "The time is 12"
        }
        else -> {
            println("statement2")
            "The time is not 12"
        }
    }

//    Control flow: when: condition checks are inside the body
    when {
        (alarm <= 12) -> {
            println("The time is less than or equal to 12.")
        }
        else -> {
            println("The time is greater than 12.")
        }
    }
}