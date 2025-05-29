package io.silver.S01

val NAME = "망고" // 변수를 밖에서 만들면 다른 파일에서 사용할 수 있다.
var AGE = 10

fun main() {

    println(NAME)
    println(AGE)
    AGE = 20 // 값도 바꿀 수 있다.
    println(AGE)


}