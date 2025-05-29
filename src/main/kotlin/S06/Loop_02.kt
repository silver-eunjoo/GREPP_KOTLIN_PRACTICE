package S06

fun main() {

    // .. 연산자 (범위 생성 연산자)
    val range1 = 1..5
    println(range1)
    println(range1.javaClass.simpleName) // IntRange

    val range2 = 1L..5L
    println(range2)
    println(range2.javaClass.simpleName) // LongRange

    val range3 = 'a'..'e'
    println(range3)
    println(range3.javaClass.simpleName) // CharRange

    val range4 = "aaa".."eee"
    println(range4)
    println(range4.javaClass.simpleName)

    // 역방향 범위
    val range5 = 5 downTo 1 // 5~1까지 역순으로 만들어준다. (infix 함수임)
    println(range5)

    // 범위 간격 조절
    val range6 = 1..10 step 2

    val range7 = 10 downTo 1 step 3

    // [ 1, 2, 3, 4, 5]
    // 1..(5-1)

    // 열린 범위 연산자
    val range8 = 0 until 5

    // 포함 여부
    // in

    val s1 = 1..10 step 2
    val t1 = 3

    println("t1 in s1? = ${t1 in s1}")
    println("t1 not in s1? = ${t1 !in s1}")

    // 어떠한 범위가
    // 어떠한 범위안에 포함되는가?
    val c1 = 1..5
    val c2 = 2..4

    println("c2 include c1? = ${c1.first in c2 && c1.last in c2}")
    println("c1 include c2? = ${c2.first in c1 && c2.last in c1}")

    println(c1.isWithin(c2))
    println(c2.isWithin(c1))
}

fun IntRange.isWithin(outer: IntRange) : Boolean {
    return this.first in outer && this.last in outer
}