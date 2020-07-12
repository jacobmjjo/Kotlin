package chap5.section2.init

class Bird(var name: String, var wing: String, var beak: String, var color: String){

    init{
        println("------초기화 블록 시작--------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("------- 초기화 블록 끝----------")

    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short","blue")

    coco.color
}