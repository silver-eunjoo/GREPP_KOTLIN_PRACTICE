package S19

fun main() {

    @Synchronized
    {}

    val value1 = Any()

    synchronized(value1) {

    }

}

@Synchronized
fun synchronizedFunction() {
    println("${Thread.currentThread().name}")
}