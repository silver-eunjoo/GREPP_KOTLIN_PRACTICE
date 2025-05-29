package S06

fun main() {

    val range1 = 1..10

    for (num in range1) {
        print("$num ")
    }
    println()

    for( num in 1..10) {
        print("$num ")
    }
    println()

    for(num in 10 downTo 1) {
        print("$num ")
    }
    println()

    for(num in 1..10 step 2) {
        print("$num ")
    }
    println()

    for(num in 2..10 step 2) {
        print("$num ")
    }
    println()

}