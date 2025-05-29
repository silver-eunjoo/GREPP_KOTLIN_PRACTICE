package S06

var k = 1
fun main() {

    var i = 1
    do {
        print("$i ")
        i*=2
    } while (i < 10)

    do processDoWhile() while (k < 10)

}

fun processDoWhile() {
    k *= 2
    print("")
}