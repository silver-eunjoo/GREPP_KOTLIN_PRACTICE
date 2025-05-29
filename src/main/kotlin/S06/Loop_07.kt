package S06

fun main() {
    for ( i in 1..10 ){
        if(i == 5) {
            continue
        }
        print("$i ")
    }
    println()

    outer@for(i in 1..3) {
        for ( j in 1..3) {
            if( j == 2) continue@outer
            println("i = $i , j = $j ")
        }
        println()
    }

    val map = arrayOf(
        arrayOf("O", "X", "O", "O"),
        arrayOf("O", "O", "T", "O"),
        arrayOf("O", "X", "X", "X"),
    )

    outer@for( i in map.indices) {
        for( j in map[i].indices) {
            val land = map[i][j]

            when (land) {
                "X" -> {
                    println("X를 만나서 건너 뛰겠습니다.")
                    continue@outer
                }

                "T" -> {
                    println("($i, $j)에서 T를 찾았습니다!")
                    break@outer
                }

                else -> { println("탐색중... ") }
            }
        }
    }

}