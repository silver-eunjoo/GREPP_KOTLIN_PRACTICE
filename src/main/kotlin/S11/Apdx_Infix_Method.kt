package S11

// infix

fun main() {

    val people1 = People("성찬")
    people1.eat("샌드위치")

    people1 eat "햄버거"

    People("앤톤") eat "밥"

}

class People(val name: String) {

    infix fun eat(sth: String) {
        println("${name}이/가 ${sth}을/를 맛있게 먹습니다.")
    }

}