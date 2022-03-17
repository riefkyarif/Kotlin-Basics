fun main() {
    println("Happy Birthday, Rover!")
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    println("You are already 5!")
    println("5 is the very best age to celebrate!")

    println("=======================")
    println("Happy Birthday, Jhansi!")
    println("=======================")
}
#=================================================================================
fun printBorder() {
    println("=======================")
}
#=================================================================================

fun main() {
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder() {
    println("=======================")
}

#=================================================================================
# Repeat a border pattern

fun printBorder() {
    repeat(23) {
        print("=")
    }
}

#the final code:
fun main() {
    printBorder()
    println("Happy Birthday, Jhansi!")
    printBorder()
}

fun printBorder() {
    repeat(23) {
        print("=")
    }
    println()
}

#change the symbols:
fun main() {
    val border = "%"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}

#change the symbols to flow:
fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}