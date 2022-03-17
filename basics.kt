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