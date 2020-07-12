package chap02.section4

fun main() {
    val number1 = 12    // 0000 1100
    val number2 = 25    // 0001 1001
    val result: Int

    result = number1 or number2  // 0001 1101
    println(result)
}