package S17

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors


fun main() {

    val threadPool = Executors.newFixedThreadPool(1)

    println("메인 쓰레드 : ${Thread.currentThread().name}")

    threadPool.submit {

        println("[1] 작업 시작 - 현재 쓰레드 : ${Thread.currentThread().name}")

        // GlobalScope의 생명주기는 main을 따라간다.
        runBlocking { // async는 뭔가 반환할 때 쓴다.
            println("[2] runBlocking.launch 진입 - 현재 쓰레드 : ${Thread.currentThread().name}")
            repeat(3) {
                delay(500)
                println("[3] runBlocking 내부 작업 처리중.. ${it}")
            }
            println("[4] runBlocking.launch 종료")
        }
        println("[5] launch 호출 직후!")
    }

    threadPool.shutdown()
    while(!threadPool.isTerminated) {
        Thread.sleep(100)
    }

}