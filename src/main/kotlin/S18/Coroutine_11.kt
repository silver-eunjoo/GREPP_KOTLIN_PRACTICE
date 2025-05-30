package S18

import kotlinx.coroutines.*

suspend fun fetchData() : String{
    delay(5500)
    return "받아온 데이터!"
}

fun main() = runBlocking<Unit>{

//    println(fetchData()) // 얘를 이렇게 실행하면 5.5초 기다리기 때문

    val result = async { fetchData() }

    launch {
        repeat(5) { i ->
            delay(1000)
            println("작업 처리 중... ${i+1}초 경과")
        }
    }

    println("데이터 받아오는 중")
    println(result.await())

}