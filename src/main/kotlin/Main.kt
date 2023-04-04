import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    // Get input
    print("Digite um número: ")
    val userInput = readLine()
    var num: Double? = null

    // Check if the string is a number
    if (userInput?.isNumeric() == true) {
        // Converts to double
        num = userInput.toDouble()
        // Evaluate and prints result
        if (num.isFibonacci()) {
            println("O número digitado faz parte da sequência de Fibonacci.")
        }
        else {
            println("O número digitado não faz parte da sequência de Fibonacci.")
        }

    }
    else {
        println("Valor de entrada inválido!")
    }

}

// Extension Functions


// Returns true if string is numerical
fun String.isNumeric() : Boolean {
    return this.toDoubleOrNull() != null
}

// Returns true if double is part of the Fibonacci Sequence
fun Double.isFibonacci() : Boolean {

    val firstNum = 5 * this.pow(2) + 4
    val secondNum = 5 * this.pow(2) - 4

    return (firstNum.isPerfectSquare() || secondNum.isPerfectSquare())

}

// Returns true if the number is a perfect square
fun Double.isPerfectSquare() : Boolean {
    val square = floor(sqrt(this))
    return (this == square * square)
}