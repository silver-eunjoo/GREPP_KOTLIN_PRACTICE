package S08

class 붕어빵 {

    var 속재료:String? = null

    fun 어떤_붕어빵() {
        println("속재료 : $속재료")
        println("저는, $속재료 붕어빵 입니다!")
    }

}

fun main() {
    val 팥붕어빵: 붕어빵 = 붕어빵()

    팥붕어빵.속재료 = "팥"
    팥붕어빵.어떤_붕어빵()

}