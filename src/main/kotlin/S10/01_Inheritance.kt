package S10

fun main() {

    val subIns = SubClass()

    println("subIns.name = ${subIns.name}")
    subIns.introduce()
}

open class BaseClass {
    private val uniqueName: String = "BaseClass"

    open val name: String = "BaseClass"

    open fun introduce() {
        println("Hello World!")
    }

}

open class SubClass : BaseClass() {
//    val name: String = "SubClass"
    // final 이기 때문에 오버라이드 할 수 없다.

    override val name: String = "SubClass"

    override fun introduce() {
        println("Hello World!")
    }
}
