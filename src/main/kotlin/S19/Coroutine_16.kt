package S19

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

val context = newSingleThreadContext("GreppContext")

var contextCount: Int = 0

suspend fun process2(action : suspend () -> Unit) {
    var i = 100
    var j = 100

    val time = measureTimeMillis {
        val services = List(i) {
            GlobalScope.launch {
                repeat(j) {
                    action()
                }
            }
        }
        services.forEach { it.join() }
    }
    println("${i * j}만큼의 작업을 수행하는데 ${time}ms 만큼의 시간이 소요되었습니다.")
}

fun main() = runBlocking<Unit> {

    process2 {
        println("쓰레드 - ${Thread.currentThread().name}")
        withContext(context) {
            println("쓰레드 - ${Thread.currentThread().name}")
            contextCount++
        }
    }
    println("generalCount=$contextCount")
}