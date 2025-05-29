package S07


//maina
// fun main(args: Array<String>) {
//
// }

// main
fun main() {
    sayWord("Hello World!")
//    sayWord(1)

    sayName()
    sayName("Anton")

    //
    orderCoffee("아메리카노", "Tall", true)
    orderCoffee(name="돌체라떼", "Grande", true)
    orderCoffee(size="Tall", name="아메리카노", isIce=true)
//    orderCoffee(size="Tall", name="아메리카노", true)

    //
    printCartList(4, "성찬", "앤톤", "은석", "쇼타로", "원빈", "소희")

    val cartList = arrayOf("감자", "고구마", "계란", "파")
    printCartList(cartList.size, *cartList)
    // spread 연산자 *로 풀어서 넣어줄 수 있다.

    logging(msg=arrayOf("로그1", "로그2", "로그3")) // 얘는 스마트 캐스트로 인해 array로 넣어도 가능한 것이다.
    logging("FATAL", "오류1", "오류2")


}

fun sayWord(word: String) {
    println(word)
}

fun sayName(name: String = "성찬") : Unit {
    println("안녕하세요, 결혼해요! ${name}님!")
}

fun orderCoffee(name: String, size : String, isIce: Boolean) : Unit {
    println("$size 사이즈 ${if (isIce) "아이스" else "핫"} $name(을)를 주문했습니다!")
}

// 가변인자 vararg
// 가변인자는 매개변수 가장 마지막에 와야 한다.
fun printCartList(size: Int, vararg items: String) {
    println("$size 크기의 장바구니에 ${items.joinToString(", ")}(이)가 들어있습니다.")
}

fun logging(type : String = "INFO", vararg msg : String) {
    for (s: String in msg) {
        println("[${type}] $s")
    }
}