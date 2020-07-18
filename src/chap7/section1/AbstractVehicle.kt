package chap7.section1

//추상 클래스 , 주 생성자
abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    // 추상 프로퍼티
    abstract var maxSpeed: Double

    //일반 프로퍼티
    var  year = "2018"

    //추상 메서드(반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    //일반 메서드
    fun displaySpecs(){
        println("Name: $name, Color: $color, Weight: $weight, year: $year, maxSpeed: $maxSpeed")
    }

}

class Car(name: String, color: String, weight: Double,
          override var maxSpeed: Double)
    : Vehicle(name,color, weight) {

    override fun start() {
        //코드의 구현
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {

    override fun start() {
        println("Bike Started")
    }
    override fun stop(){
        println("Bike Stopped")
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"


    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()

}

