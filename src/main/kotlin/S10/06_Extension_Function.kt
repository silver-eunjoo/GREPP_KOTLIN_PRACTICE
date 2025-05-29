package S10

fun main() {

    println("happy happy".printUpperCase())
    1.printPrice()

    10.customSum(20)

    // 확장 함수 : 기존 클래스에 새로운 메서드를 추가할 수 있다.

    val sentence = "Hello World!"

    sentence.printUpperCase()

    val order1 = EfCoffeeOrder("아메리카노", "T")
    order1.printPrice()

    order1.changeSize("G")
}

fun Int.customSum(target: Int) {
    println("두 값을 더하면 ${this + target}")
}

fun Int.printPrice() {
    println("가격가격")
}

fun String.printUpperCase() { // 모듈 내에서는 사용할 수 있다.
    println(this.uppercase())
}

class EfCoffeeOrder(var type: String, var size: String) {
    fun printPrice() = when(size) {
        "T" -> println("$type $size 는 3000원입니다.")
        "G" -> println("$type $size 는 3500원입니다.")
        else -> println("사이즈가 잘못되었습니다.")
    }
}

