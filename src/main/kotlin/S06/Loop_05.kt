package S06

fun main() {

    // Q1.
    for (num in 1..9) {
        println("7 * ${num} = ${7 * num}")
    }

    //Q2.
    for (i in 0 until 5){
        for(j in 0 until 5) {
            print("*")
        }
        println()
    }

}

fun a1() {
    for ( i in 1..9){
        println("7 *$i = ${7 * i}")
    }
}

fun _a1() {
    (1..9).forEach { _ ->
        println("7 *$i = ${7 * i}")
    }
}

fun a2() {
    repeat(5) {
        println("*".repeat(5))
    }
}