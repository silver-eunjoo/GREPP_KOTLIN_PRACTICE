package S18

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    val result: Job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }

    println("Hello,")
    println("job.isActive : ${result.isActive}, completed: ${result.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive : ${result.isActive}, completed: ${result.isCompleted}")

}