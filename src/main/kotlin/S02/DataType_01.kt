package S02

fun main() {

    // Long
    // 10l : 코틀린에서는 소문자를 인정해주지 않는다.
    // 10L

//    val a = 10l (x) 식별자라고 부르는데, 소문자 l은 인정해주지 않는다.
    val a = 10L

    // float
    // 3.14f
    // 3.14F

    var b = .1f
    b = .1F

    var c:Char = 'A'
    c = 66.toChar()

    println(c)

    val d = 'B'.code
    println(d)

    val name: String = "Mango"
    println("name = $name")

    val desc: String = """
       달콤하고 맛있는 노란색 망고
       오늘도 먹고 내일도 먹고 
       라이즈 대박 너무 잘생김 헉
    """.trimIndent()
    println(desc)

    // 문자열 템플릿
    // 1. $변수명
    val favorite: String = "Favorite $name"
    println("favorite = $favorite")

//    val sc = "성찬씨 결혼해. $name 입니다."

    // 2. ${표현식}
    val number: Int = 20
    val sentence1 = "nu${number}mber"

    println("sentence1 = ${sentence1}")

    val price: Int = 20
    val amount = 10

    val sentence2 = "총 금액은 = ${price * amount}원입니다."
    println(sentence2)
}