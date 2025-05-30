package S18

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit>{
    
    val asyncValue: Deferred<String> = async {
        delay(5000)

        "결과값"
    }

//    println(asyncValue) // 이렇게 하면 delay 때문에 기다리다가 종료되기 때문에 결과값을 받아올 수 없다.
    println(asyncValue.await())
    
}