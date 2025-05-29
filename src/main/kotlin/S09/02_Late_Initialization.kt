package S09

fun main() {

    val aInstance: A = A()
    aInstance.prop = "A"
    aInstance.printProp()

    val cat: OopAnimal = OopAnimal()
    cat.sayName()

    cat.name = "성찬"
    cat.sayName()
}

class A {

    lateinit var prop: String

    fun printProp() {
        println(prop)
    }
}

class OopAnimal {
    lateinit var name: String

    fun sayName() {
        if( ::name.isInitialized) {
            println("제 이름은 ${name}입니다.")
        } else {
            println("저는 아직 이름이 없습니다.")
        }
    }
}