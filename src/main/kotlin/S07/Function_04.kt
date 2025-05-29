package S07

fun main() {
    _sayName("성찬")

    func1({println("Hello World!")})
    func1(){println("Hello World!")}


    func1_1("TAG") {
        println("Hello World!")
    }

    func1_2("Tag", { println("Hello World!") }, "NAME")

    func2(10, {println("$it")})

    placeBookOrder(3){
        println("책을 ${it}권 주문합니다!")
    }

}

fun _sayName(name: String) {
    println("안녕하세요 ${name}님")
}

fun func1(fn: () -> Unit) {
    println("Func1 start")
    fn()
    println("Func1 end")
}

fun func1_1(tag: String, fn: () -> Unit) {
    println("tag: $tag")
    fn()
}

fun func1_2(tag: String, fn: () -> Unit, name : String) {
    println("tag: $tag")
    fn()
    println("name = $name")
}

inline fun func2(number: Int, fn : (Int) -> Unit) {
    println("저는 func2의 시작점입니다.")
    fn(number)
    println("저는 func2의 끝점입니다.")
}

inline fun placeBookOrder(quantity: Int, order: (Int) -> Unit) {
    println("책 ${quantity}권을 출판사로부터 확보합니다.")
    order(quantity)
    println("책 주문이 완료되었습니다.")
}