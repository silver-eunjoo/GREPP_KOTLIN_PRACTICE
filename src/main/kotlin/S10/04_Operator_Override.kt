package S10

// Opeartor Override
fun main() {

    val coffee1 = OpCoffee("아메리카노", "")
    val coffee2 = OpCoffee("카페라떼", "")

    val result: String = coffee1 + coffee2
    println("result = ${result}")

    Board() + Post()

    val value1 = coffee1[10]
    println("value1 = ${value1}")

}

class Board {
    operator fun plus(p: Post) : Unit {
        println("게시물 추가 완료")
    }
}
class Post

class OpCoffee(val type: String, val size:String) {

    operator fun plus(other: OpCoffee) : String {
        return "첫번째 커피 : ${this.type}, 두번째 커피 : ${other.type}"
    }

    // +=
    operator fun plusAssign(other: OpCoffee) {

    }

    // -
    operator fun minus(other: OpCoffee) {

    }

    // *
    operator fun times(other: OpCoffee){}

    // /
    operator fun div(other: OpCoffee) {}

    // %
    operator fun rem(other: OpCoffee){}

    // >
    operator fun compareTo(other:OrdDog) : Int {
        return 0
    }

    // 인덱싱
    operator fun get(index: Int) : String {

        val sizeList = listOf("Tall", "Grande", "Venti", "Trente")
        return sizeList.getOrElse(index) {"그런 사이즈는 없습니다."}

    }

    // in
    operator fun contains(other: OrdDog) : Boolean {
        return false
    }
}