package S17

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {// runBlocking도 scope임. 현재 스레드를 블락킹, 중단시키는 스코프
    launch {
        println("runBlocking: 현재 실행 스코프 : ${this.coroutineContext}")
        println("현재 실행 중인 스레드 : ${Thread.currentThread().name}") // main
    }
}
