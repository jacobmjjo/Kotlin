package chap6.section1.customproperty

import java.lang.AssertionError

class User(_id:Int, _name:String, _age:Int){
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by ohters")
        }
    var age: Int = _age
}

fun main() {
    val user1 = User(1,"super", 29)
    user1.name = ""
    println("User1.name = ${user1.name}")
}