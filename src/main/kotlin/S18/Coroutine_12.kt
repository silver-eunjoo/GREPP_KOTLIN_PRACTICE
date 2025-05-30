package S18

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    val numbers = sequence {
        println("yield(1)전")
        yield(1)
        println("yield(1)후")
        println("yield(2)전")
        yield(2)
        println("yield(2)후")
        println("yield(3)전")
        yield(3)
        println("yield(3)후")
    }

    launch {
        for(num in numbers) {
            println(num)
            delay(5000)
        }
    }

}