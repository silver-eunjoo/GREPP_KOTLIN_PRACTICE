package S19

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

val mutex = Mutex()
var mutexCount = 0
suspend fun process3(action : suspend () -> Unit) {
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

    process3 {
        mutex.withLock {
            mutexCount++
        }
    }
    println("mutexCount=$mutexCount")
}