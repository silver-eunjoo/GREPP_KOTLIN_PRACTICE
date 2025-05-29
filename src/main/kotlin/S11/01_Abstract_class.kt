package S11

fun main() {

    val payments = listOf<PaymentProcessor>(KakaoPaymentProcessor(), NaverPaymentProcessor())

    for (payment in payments) {
        payment.pay(5000)
    }

}

abstract class AbsClass {

    abstract fun absMethod()

    fun concreteMethod1() {
        println("정의가 되어있는 메서드! 1")
    }

    open fun concreteMethod2() {
        println("정의가 되어있는 메서드! 2")
    }

}

class ImplClass : AbsClass() {
    override fun absMethod() {
        println("구현한 메서드!")
    }

    fun concreteMethod1(a: Int) {
        println("오버로딩! $a")
    }

    override fun concreteMethod2() {
        println("정의가 되어있는 메서드! 1")
    }
}

abstract class PaymentProcessor(val type: String) {
    abstract fun pay(amount: Int)

    open fun printReceipt() {
        println("==== 영수증 ====")
        println("==============")
    }
}

class KakaoPaymentProcessor: PaymentProcessor("Kakao") {
    override fun pay(amount: Int) {
        println("${amount}원을 ${type}페이로 결제합니다!")
    }

}

class NaverPaymentProcessor : PaymentProcessor("Naver") {
    override fun pay(amount: Int) {
        println("${amount}원을 ${type}페이로 결제합니다!")
    }
}