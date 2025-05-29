package S07

var npCounter: Int = 0

fun increaseNpCounter(x: Int) : Int {
    npCounter++
    return x + npCounter
}

fun main() {

    println("npCounter = ${npCounter}")

    // 순수 함수로, 언제 불러도 같은 반환값을 낸다.
    println(power(3)) // 9
    println(power(3)) // 9
    println(power(5)) // 25
    println(power(3)) // 9

    println()

    println("npCounter = ${npCounter}")
    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println("npCounter = ${npCounter}")

    // 익명 함수
    fun() {
        println("Hello World!")
    }

    val sayHello = fun() {
        println("Hello World!")
    }

    sayHello()

    // 람다 표현식
    val sayBye: () -> Unit = { println("Bye World!") }
    sayBye()

    println()

    val sum = { a : Int, b: Int -> a + b }
    val sum2 : (Int, Int) -> Int = { a, b -> a + b }
    val sum3 : (Int, Int) -> Int = {
        a, b ->
        println("입력받은 값 : ${a}, ${b}")
        a + b
    }
    val sumResult: Int = sum(2,3)
    println("sumResult = $sumResult")

    val ap: (Int, Int) -> Int = ap@{ x, y ->
        if (x > y) {
            return@ap x
        }
        x + y
    }

    val app1 = ap(100, 200)
    val app2 = ap(200, 100)

    println("app1 = ${app1}") // 300
    println("app2 = ${app2}") // 300
    // 라벨을 붙여주기 전까지는 같은 값을 리턴한다. 왜냐? 항상 맨 마지막 걸 반환하기 때문에
    // 라벨을 붙이면 람다식에서도 return을 사용할 수 있다.

}

fun power(x: Int) : Int {
    return x * x
}