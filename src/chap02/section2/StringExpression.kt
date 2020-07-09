package chap02.section2

fun main() {
    var a = 1
    var str1: String = "a is $a"
    var str2: String = "a +2 is ${a+2}"

    println("str1: \"$str1\", str2:\"$str2\"")
}