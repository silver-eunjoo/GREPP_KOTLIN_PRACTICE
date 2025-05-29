package S03

fun main() {
    val pmA : Int = 10
    val pmB = 5

    val sumResult = pmA + pmB
    println("sumResult = ${sumResult}")

    val divA = 10
    val divB = 3

    val divResult1 = divA / divB
    println("divResult = ${divResult1}")

    // val divResult1 = (Double)divA / divB (x)
    val divResult2 = divA.toDouble()/divB // Double 로 스마트 캐스팅이 된다.
    println("divResult = ${divResult2}")

    var postIncA: Int = 5
    postIncA++ // postIncA = postIncA + 1 => val (x)

    var q1 = 5
    println("q1 = " + (q1++ * 3))

    q1 = 5
    println("q1 = ${q1++ *3}")

}