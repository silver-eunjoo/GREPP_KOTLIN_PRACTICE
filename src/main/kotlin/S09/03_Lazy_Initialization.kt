package S09

fun main() {
    val 성찬 = OopStudent()
    println("성찬이 이름 = ${성찬.name}")
    println("성찬이 이름 = ${성찬.name}")

    val reader : OopFileReader = OopFileReader()
    val contents1 = reader.contents
    println(contents1)
    val contents2 = reader.contents
    println(contents2)

}

class OopStudent {
    val name: String by lazy {
        println("초기화중")
        "성찬"
    }

}

class OopFileReader {

    val contents : String by lazy {
        println("파일을 읽어들이는 무거운 작업을 수행합니다.")
        "엄청_무거운_작업_이후_읽어들인_파일_내용"
    }

}