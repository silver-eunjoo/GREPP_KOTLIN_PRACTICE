package S17

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

fun main() {

    // GlobalScope는 app 전체 생명주기를 따라가는 가장 넓은 스코프이다.
    // GlobalScope는 DefaultContext를 가진다.
    GlobalScope.launch { // 내부적으로 스레드풀을 만든다. 그럼 worker threadpool을 만든다. 그래서 시간이 좀 걸림.
        println("현재 스코프 : ${this.coroutineContext}")
        println("현재 쓰레드 : ${Thread.currentThread().name}")
        // 현재 쓰레드 : DefaultDispatcher-worker-1
    }

    println("Hello, ")

    Thread.sleep(3000) // 기다려줘야지만 GlobalScope 흐름이 실행되는 것을 볼 수 있다.
}