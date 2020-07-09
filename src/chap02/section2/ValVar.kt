package chap02.section2

fun main() {
    val number = 10 // number를 int로 추론
    var language = "Korean" //language 변수는 String으로 추론
    val secondNumber: Int = 20 // secondNumber 변수는 자료형을 int형으로 명시적으로 지정
    language = "English"
    //number = 20 var로 변경하라는 에러가 발생함
    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val num05 = 127
    val num06 = -321768
    val num07 = 23123124135135

    val exp03 = 3.14E-2     //0.0314 임
    val exp04 = 3.14e2      //314 임
    println("exp3 is $exp03 and exp4 is $exp04")     // 0.0314
    
}
