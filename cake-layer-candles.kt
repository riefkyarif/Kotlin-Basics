#Create printCakeCandles()

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }    
    println() // Print an empty line   
 
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}