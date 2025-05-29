package S13

class HelloRobot {

    companion object { // object instance를 딱 하나만 만들 때 사용하는 것 -> 싱글톤 객체를 만들 수 있게 된다.
        fun hello() {
            println("Hello! Hello! Hello!")
        }
    }

}

class ByeRobot {

    companion object {
        @JvmStatic
        fun bye() {
            println("Bye! Bye! Bye!")
        }
    }

}

fun main() {

    HelloRobot.hello() // 정적으로 접근할 수 있는 메서드가 생긴 것.
    ByeRobot.bye()

    val robot = HelloRobot()
//    robot.hello()

}