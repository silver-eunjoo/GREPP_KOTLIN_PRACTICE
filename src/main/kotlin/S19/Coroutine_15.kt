package S19

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

var generalCount: Int = 0
var atomic = AtomicInteger(0)


suspend fun process1(action : suspend () -> Unit) {
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
    process1 {
        generalCount++
    }
    println("generalCount=$generalCount")
    process1 {
        atomic.incrementAndGet()
    }
    println("generalCount=$atomic")
}