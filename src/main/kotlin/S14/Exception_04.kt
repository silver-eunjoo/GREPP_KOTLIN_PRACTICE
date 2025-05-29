package S14

fun main() {
    runCatching {
        throw CustomException("직접 정의한 예외의 메세지입니다.")
    }.onFailure {
        println("직접 정의한 예외가 감지되었습니다.")
        println("${it.message}")
    }
}


class CustomException(message:String): Exception(message)