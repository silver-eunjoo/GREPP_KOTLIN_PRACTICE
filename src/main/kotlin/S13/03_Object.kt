package S13

// 단 하나의 인스턴스만 존재하는 싱글톤 객체가 만들어진다. 생성자 만들 수 없음.
object Logger {
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
}

object Config {
    val appName: String
    val version : String

    init {
        println("Config initialized")
        appName = "MyApp"
        version = "1.0"
    }
}

class Game {

    companion object Settings {
        val difficulty = "Hard"
        fun printSettings() = println("난이도 : $difficulty")
    }
}

interface ClickListener {
    fun onClick()
}

fun handleClick(listener : ClickListener) {
    listener.onClick()
}

fun handleClick(listener: () -> Unit ) {
    listener()
}

open class ObjAnimal(val name: String) {
    open fun eat(sth: String) = println("$sth 를 먹습니다!")
}

object Dog : ObjAnimal("바둑이") {
    override fun eat(sth: String) {
        super.eat(sth)
    }
}

fun main() {
    Logger.log("Hello")

    Config.appName // lazy하게 올라가는 것

    handleClick(object: ClickListener {
        override fun onClick() {
            println("버튼이 클릭되었습니다!")
        }
    })

    Game.Settings.difficulty
    Game.Settings.printSettings()

    Game.difficulty // companion이 있기 때문에 가능하다.

    Dog.eat("간식")
}