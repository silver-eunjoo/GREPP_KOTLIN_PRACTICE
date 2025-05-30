package S15

fun main() {

    val animals = listOf(GeDog(), GeCat())
    var cars = listOf(GeCar(), GeCar())

    feedToAnimal(animals, "간식")

    println()

    val result1 = sumNumbers<Int>(1, 1, { x, y -> 5})
    println("result1 = $result1")

    val result2 = sumNumbers(1, 1, { x, y -> 5})
    println("result2 = $result2")

    val result3 = sumNumbers(1, 1, { x, y -> x + y})
    println("result3 = $result3")

    val result4 = sumNumbers(1, 1) { x, y -> x + y}
    println("result4 = $result4")

//    val result5 = sumNumbers("1", "1") { x, y -> x + y}
//    println("result5 = $result5")

}

open class GeAnimal(val name: String) {
    fun eat(sth: String)  {
        println("${name}이/가 ${sth}을/를 먹습니다.")
    }
}

class GeDog: GeAnimal("Dog")
class GeCat: GeAnimal("Cat")

class GeCar

fun <T:GeAnimal> feedToAnimal(targets: List<T>, sth: String): Unit {
    for (animal in targets) {
        animal.eat(sth)
    }
}

fun <T: Number> sumNumbers(a: T, b: T, operation : (T, T) -> T) : T {
    return operation(a, b)
}