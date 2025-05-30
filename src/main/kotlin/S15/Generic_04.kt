package S15

interface Drivable
interface Flyable

open class FlyEngine : Flyable
open class FlyCarEngine : Flyable, Drivable
open class LiVehicle: Drivable

class LiFlyCar : LiVehicle(), Flyable

fun <T> maintenance(target: T) where T : Drivable, T: Flyable{
    println("${target}을/를 점검합니다.")
}

fun <T> fix(target: T) where T: LiVehicle, T: Flyable{
    println("${target}을/를 수리합니다.")
}

fun main() {
    maintenance(LiFlyCar())
    maintenance(FlyCarEngine())

//    maintenance(LiVehicle())
//    maintenance(FlyEngine())

    fix(LiFlyCar())
//    fix(FlyCarEngine()) // LiVehicle 없음
//    fix(LiVehicle())
//    fix(FlyEngine())

}