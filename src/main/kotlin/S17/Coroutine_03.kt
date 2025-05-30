package S17

import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

fun main() = runBlocking<Unit> {

    val threadPool = Executors.newFixedThreadPool(5)

    val startTime = System.currentTimeMillis()

    val services = List(100){ idx ->
        {
            println("작업 ${idx}번 시작 - 사용된 쓰레드 : ${Thread.currentThread().name}")
            Thread.sleep(2000)
            println("작업 ${idx}번 종료 - 사용된 쓰레드 : ${Thread.currentThread().name}")
        }
    }

    for (logic in services) {
        threadPool.submit { // 놀고 있는 스레드가 있다면 logic()을 실행하라고 하는 것
            logic()
        }
    }

    threadPool.shutdown()
    while(!threadPool.isTerminated) {
        Thread.sleep(100)
    }

    val endTime = System.currentTimeMillis()
    println("총 소요시간 ${endTime - startTime} ms")
}