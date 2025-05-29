package S05

fun main() {

    val level: Int = 1

    when (level) {
        1 -> println("플래티넘")
        2 -> println("골드")
        3 -> println("실버")
        4 -> println("일반")
        else -> println("")
    }

    when {
        level == 1 -> println("플래티넘")
        level == 2 -> println("골드")
        level == 3 -> println("실버")
        level == 4 -> println("일반")
    }

    val levelResult = when (level) {
        1 -> "플래티넘"
        2 -> "골드"
        3 -> "실버"
        4 -> "일반"
        else -> "없음"
    }

    println("levelResult = ${levelResult}")

}