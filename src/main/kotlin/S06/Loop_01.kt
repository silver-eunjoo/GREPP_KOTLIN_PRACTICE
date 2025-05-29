package S06

var i: Int = 1
var j: Int = 1

fun main() {

//    while(true) {
//        println("무한루프!")
//    }

    var count: Int = 0

    while (count <= 10){
        print("$count ")
        count++
    }

    println()

    while(i<=10) printHello()
    println()

    while(j<=10)
        printStar()
    println()
}

fun printHello() {
    print("Hello ")
    i++
}

fun printStar() {
    print("* ")
    j*=2
}