package S05

fun main() {

    val score: Int = 85

    val result: String = if(score > 89) {
        "A"
    } else if (score > 79){
        "B"
    } else {
        "C"
    }

    println("result = $result")

    val result2 = if(score>89) 'A' else 'B'
    println("result2 = ${result2}")

    val result3: String = if(score > 89){ // 이렇게 쓰면 코드를 더 쓸 수 있다.
        println("A로 합격하셨습니다!")
        "A"
    } else if (score > 79){
        "B"
    } else {
        "C"
    }



}