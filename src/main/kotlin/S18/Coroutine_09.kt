package S18

import kotlinx.coroutines.*

fun main() = runBlocking{

    val result1: Job = launch {
        delay(500)
        println("World!")
    }

    val result2: Job = launch {
        delay(2500)
        println("World!")
    }

    println("Hello,")

    result1.join()
    result2.join()
}