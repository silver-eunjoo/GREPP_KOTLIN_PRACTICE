package S03

data class Box(val name : String)

fun main() {
    val a = 10
    val b = 5
    val c = a
    val d = a

    val aGtb = a > b
    println("aGtb = $aGtb")

    val aEqb = a != b
    println("aEqb = $aEqb")

    val cRefEqd = c === d
    println("cRefEqd = $cRefEqd")

    val cRefNeqd = c !== d
    println("cRefNeqd = $cRefNeqd")

    val box1: Box = Box("A") // kotlin은 new 키워드가 필요없다.
    val box2: Box = Box("A")
    val box3: Box = box1

    println(box1 == box2) // true -> equals를 오버라이드 해놨다.
    println(box1 === box2) // false
    println(box1 === box3) // true




}