package S07

fun main() {

    orderCoffee()

    val 성찬 = Person()
    성찬 eat "햄버거"
}

class Person {
    infix fun eat(sth: String) {
        println("$sth 를 먹는다.")
    }
}

fun orderCoffee() {
    println("아메리카노 한 잔 주문하셨습니다!")
}

fun orderCoffee(type : String) {
    println("$type 한 잔 주문하셨습니다!")
}

fun orderCoffee(type : String, size: String) {
    println("$size 사이즈 $type 한 잔 주문하셨습니다!")
}

fun sum(a: Int, b: Int) :Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int) :Int {
    return a + b + c
}

fun sum(a: Double, b: Double) : Double {
    return a + b
}