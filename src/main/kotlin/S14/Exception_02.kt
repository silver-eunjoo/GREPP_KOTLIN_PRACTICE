package S14

fun main() {

    try {
        throw IllegalArgumentException("예외가 발생했습니다!")
    } catch ( e : IllegalArgumentException ) {
        println("예외에서 온 메세지 : ${e.message}")
    } finally {
        // out * 하위 타입이 상위 타입에 대입 가능
        // in * 상위 타입이 하위 타입에 대입 가능
        println("예외 발생 여부와 상관없이 반드시 실행된다!")
    }


}