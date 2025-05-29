package S04

fun main() {

    // 스마트 캐스트
    var value: Number = 10.0
    println("value = ${value}")
    println("type of value = ${value::class.simpleName}") // Double

    value = 10
    println("type of value = ${value::class.simpleName}") // Double

    value = 10L
    println("type of value = ${value::class.simpleName}") // Double



}