package S10

fun main() {
    OopDog("성찬")
    val cat1 = OopCat1()
    println("cat1.name = ${cat1.name}")
}

open class OopAnimal(val name: String)

class OopDog(name: String) : OopAnimal(name)

class OopCat1 : OopAnimal {
    constructor(): super("나비") {
        // 부 생성자를 호출하면 주 생성자가 먼저 호출된다.
    }
}
