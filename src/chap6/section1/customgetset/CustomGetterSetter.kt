package chap6.section1.customgetset

class User(_id:Int, _name: String, _age:Int){ // 주 생성장
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase() // 받은 인자를 대문자로 변경
        }
    var age: Int = _age

}

fun main() {
    val user1 = User(1, "possible", 29)
    user1.name = "haha"
    println("user2.name = ${user1.name}")
}