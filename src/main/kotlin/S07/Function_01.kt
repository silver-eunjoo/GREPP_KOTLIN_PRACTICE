package S07

fun main() {

    myFunction1()
    myFunction2(5, 5)
    val result1 = myFunction3()
    println(result1)

    val result2 = myFunction4(2, 3)
    println(result2)

}

fun myFunction1() {
    println("Hello World!")
}

fun myFunction2(a: Int, b: Int) {
    println("a와 b의 합은 ${a+b}입니다.")
}

fun myFunction3() : String {
    return "Hello, World"
}

fun myFunction4(a: Int, b: Int) : Int{
    return a + b
}