package S15

fun main() {
//    geFunc1("A") // ClassCastException
    geFunc1(1)

    geFunc2<String>("Hello")
    geFunc2(1)

    geFunc3(300)
//    geFunc3("Hello") // ClassCastException

    val con1 = Container<String>("Hello!")
    val con2 = Container("B")

    val mapOf :Map<String, String> = mapOf(
        "Key" to "Value"
    )

    con1.printNAndGetValue<Int>(10)
    con1.printNAndGetValue("A")

}

fun geFunc1(param: Any) {
//    val result = param - 100
    val result = param as Int - 100
    println("result = ${result}")

}

fun <T> geFunc2(param: T) { // Any?

    println("파라미터 타입 = ${param!!.javaClass.simpleName}") // 널 단정 연산자로 널 아니라고 해줘야 한다.

}

fun <T> geFunc3(param : T) {
//    val result = param - 100
    val result = param as Int + 100
    println("result = ${result}")
}

class Container<T>(val value: T?) {

    fun get() : T? {
        return if(value!=null) value else throw NoSuchElementException()
    }

    fun <N> printNAndGetValue(param : N) : T?{ // 실행 중에 N은 Any?로 사용된다.
        val result = get()
        println("파라미터 값 : $param")
        println("파라미터 타입 : ${param!!.javaClass.simpleName}")
        println("result 타입 : ${result!!.javaClass.simpleName}")
        return result
    }
}