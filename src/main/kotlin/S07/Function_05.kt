package S07

fun main() {

    val process1 = fun(v: String) {
        println("parameter = $v")
    }

    process1("abc")

    // 람다식
    val process2_1 = { v: String ->
        "processed $v"
    }

    // 익명함수
    val process2 = fun(v: String) : String {
        return "processed $v"
    }

    println(process2("abc"))

    fun apply1(fn : (Int) -> Int, number: Int) : Int {
        return fn(number)
    }

    apply1({ x -> x * x}, 10)

    fun apply2(number: Int, fn : (Int) -> Int) : Int {
        return fn(number)
    }

    val result2 = apply2(10) { x ->
        x * x
    }

    println(result2)

    fun twoTimesAbs(x: Int) : () -> Int {
        return {
            if ( x > 0) x * 2 else (x * -1) *2
        }
    }

    val absV1 = twoTimesAbs(5)
    val absV2 = twoTimesAbs(-5)

    println(absV1())
    println(absV2())

    fun times(x: Int) : (Int) -> Int {
        return {
            t -> x * t
        }
    }

    val fiveTimes = times(5)

    println(fiveTimes(3))
    println(fiveTimes(5))
    println(fiveTimes(10))
    println(fiveTimes(6))

}