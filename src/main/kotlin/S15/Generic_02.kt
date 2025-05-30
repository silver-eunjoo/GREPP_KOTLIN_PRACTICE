package S15

fun main() {
    val a: List<Int> = listOf(1) // 읽기만 가능한 리스트
//    a.add(2)

    val b = mutableListOf(1) // 읽기와 쓰기가 가능한 리스트
    b.add(2)

    val valueList: List<Int> = listOf(1, 2, 3, 4)

    printElements(valueList)

    checkType(valueList)
    checkType("")

}

fun <T> printElements(list : List<T>): Unit{
    for( el in list ) {
        print("$el ")
    }
    println()
}

fun <T> checkType(param : T) {
    if ( param is List<*> ) { // 타입을 모르기 때문에 *를 써준다.
        println("param 은 리스트 타입입니다.")
    } else {
        println("param은 List 타입이 아닙니다.")
    }
}