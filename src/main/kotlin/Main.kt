// EAN Check Digit
// Modulus 10, Weight 3
fun main(args: Array<String>) {
    println("Input Code without Check Digit")
    val code = readLine() ?: ""

    var sum = 0
    for (i in code.indices) {
        try {
            if (i % 2 == 0) {
                sum += code[i].digitToInt()
            } else {
                sum += code[i].digitToInt() * 3
            }
        } catch (e: java.lang.IllegalArgumentException) {
            println("Includes Non-Number Character")
            return
        }
    }

    var checkDigit = 0
    if (sum % 10 != 0) {
        checkDigit = 10 - sum % 10
    }

    println("Check Digit: $checkDigit")
    println("Full Code  : $code$checkDigit")
}
