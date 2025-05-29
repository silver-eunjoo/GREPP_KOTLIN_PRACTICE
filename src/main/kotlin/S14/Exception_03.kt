package S14

fun main() {

    // 후행 람다식
    val result : Result<Int> = runCatching {
        10/0
    }

    result.onSuccess {
        println("나눗셈한 결과 $it")
    }

    result.onFailure {
        println("오류가 발생했습니다!")
        println("${it.message}")
    }

    runCatching {
        10/0
    }.onSuccess {
        println("나눗셈한 결과 $it")
    }.onFailure {
        println("오류가 발생했습니다!")
        println("${it.message}")
    }

    val robotFactory = RobotFactory()

    runCatching {
        robotFactory.make()
    }.onSuccess { robot ->
        println("로봇을 성공적으로 생산했습니다.")
        robot.activate()
    }.onFailure { error ->
        println("로봇을 생산하지 못했습니다.")
        println("원인 ${error.message}")
    }
}

class RobotFactory {

    fun make(mat: Int = 100) : Robot {
        val parts = makeParts(mat)
        return assemble(parts)

    }

    private fun assemble(parts: List<String>) : Robot {
        println("부품을 이용하여 로봇을 조립합니다.")
        if((1..10).random() <= 2) {
            throw IllegalStateException("유감스럽게도 로봇 조립에 실패했습니다.")
        }
        println("로봇 조립 성공했습니다!")
        return Robot(parts)
    }

    private fun makeParts(materialAmount: Int) : List<String> {

        var remain = materialAmount

        println("${remain}만큼의 금속을 이용해서 로봇의 부품을 조립합니다.")

        remain -= (1..10).random()
        println("로봇의 팔을 생성했습니다!")

        if(remain <= 8) {
            throw IllegalStateException("몸통 재료가 부족합니다.. 로봇 생산 중단합니다.")
        }

        remain -= (1..8).random()
        println("로봇의 몸통을 생성했습니다!")

        if(remain < 6) {
            throw IllegalStateException("머리 재료가 부족합니다.. 로봇 생산 중단합니다.")
        }

        remain -= (1..4).random()
        println("로봇의 머리를 생성했습니다!")

        if(remain <2) {
            throw IllegalStateException("다리 재료가 부족합니다.. 로봇 생산 중단합니다.")
        }

        remain -= (1..2).random()
        println("로봇의 다리를 생성했습니다!")

        println("로봇의 모든 부품을 생산했습니다.")

        return listOf("팔", "다리", "몸통", "머리")
    }

}

class Robot(val parts: List<String>) {

    fun activate() {
        for (part in parts) {
            println("${part}의 이상유무를 확인합니다!")
        }
        println("동작합니다!")
    }

}