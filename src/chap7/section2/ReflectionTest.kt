package chap7.section2

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor

class User(Val id: Int, val name: String, var grade: String = "Normal" ) {
    fun check() {
        if (grade == "Normal")
    }
}

fun main() {
    println(User::class) //클래스 레퍼런스를 위해
    val classInfo = User::class
    classInfo.memberProperties.forEach{
        println("Property name: ${it.name}, type: ${it.returnType}")
    }
    classInfo.memberFunctions.forEach {
        printLn("Function name: ${it.name}, type:${it.returnType}")
    }
    getKotlinType(User::class)

}
fun getKotlinType(obj: KClass<*>){
    println(obj.qualifiedName)
}