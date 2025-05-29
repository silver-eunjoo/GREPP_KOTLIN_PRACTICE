package io.silver.S01

const val URL = "jdbc:mysql://localhost:3306"

fun genValue():String {
    return "Hello World!"
}

val V_1 :String = genValue() // 함수가 호출되는 시점이 런타임이기 때문에 상수가 아니다.
const val V_2:String = "Hello World!"

fun main() {



}