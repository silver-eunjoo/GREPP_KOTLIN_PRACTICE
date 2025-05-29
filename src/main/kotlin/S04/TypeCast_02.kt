package S04

val INTEGER_VALUE: Int = 10

fun main() {

    // is
    val isResult: Boolean = INTEGER_VALUE is Int
    println("INTEGER_VALUE는 Int형 일까요? = ${isResult}")

    val s1: String = "Hello, World!"
    val s2: String? = "Bye!"

    printLength(s1)
    printLength(s2)
    isNotInteger(s1)
    isNotInteger(1)
}

fun printLength(target: Any?) {
    if(target is String) { // is로 타입추론을 하면서 스마트캐스트가 됨.
        println("문자열의 길이는 ${target.length}입니다.")
    } else {
        println("문자열이 아닙니다!")
    }
}

fun isNotInteger(target: Any?) {

    if (target !is Int) {
        println("정수가 아닙니다!")
        return
    }

    // Int Type이면 is에서 스마트 캐스팅이 되고 아래에서는 Int형으로 이용할 수 있다.
    println("정수입니다!")
    println("target의 타입 = ${target.javaClass.simpleName}")

}