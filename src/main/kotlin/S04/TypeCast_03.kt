package S04

fun main() {

    // 스마트 캐스트는 런타임 중에 발생한다.
    // as : 명시적 형변환
    val target1: Any = "Hello World!"
    val strTarget1: String = target1 as String
    println("strTarget1 type = ${strTarget1.javaClass.simpleName}")

    // ClassCastException
    // val intTarget1 = target1 as Int

    val target2: Any = 100
    val strTarget2 = target2 as? String // as? : 스마트 캐스트를 시도해보고 문제가 발생할 시 null을 할당한다.
    println("strTarget2 = ${strTarget2}")

    val itemList: List<Any> = listOf("성찬", "s2", 100000, true)
    printStr(itemList)
    
}

fun printStr(target: List<Any>) {
    for(i in target) {
        val iStr = i as? String
        if( iStr != null) {
            print("$iStr ")
        }

    }
}