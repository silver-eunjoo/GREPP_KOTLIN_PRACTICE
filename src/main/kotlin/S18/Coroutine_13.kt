package S18

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking<Unit> {

    launch {
        repeat(3) {
            println("작업 A 시작!")
            yield()
            println("작업 A 끝")
        }
    }

    launch {
        repeat(3) {
            println("작업 B 시작!")
            yield()
            println("작업 B 끝")
        }
    }
}