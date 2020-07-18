package chap5.section3.openclass

// 상속가능한 클래스를 선언하기 위해 open사
open class Bird(var name: String, var wing: Int, var beak: String, var color: String){

    fun fly() = println("Fly wing: $wing")
    fun sing() = println()
}