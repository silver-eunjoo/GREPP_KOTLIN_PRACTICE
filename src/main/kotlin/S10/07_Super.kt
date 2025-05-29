package S10

fun main() {

}

open class SpAnimal {

    open fun eat(amount: Int) {
        println("${amount}만큼 먹었습니다!")
    }

    fun sleep(hour:Int) {
        println("${hour}시간 만큼 잠을 잡니다!")
    }

}

class SpDog : SpAnimal() {

    override fun eat(amount: Int) {
        super.eat(amount)
        super.sleep(amount)
        println("배가 부릅니다!")
    }



}