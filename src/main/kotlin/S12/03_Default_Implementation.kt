package S12

fun main() {
    val instance: DiInterfaceA = DiImpl()
    instance.print()

    val instance2 = DiImpl2()
    instance2.print()

    val instance3 = DiImpl3()
    instance3.print()
}

class DiImpl : DiInterfaceA

class DiImpl2 : DiInterfaceA, DiInterfaceB {
    override fun print() {
        println("D: 직접 구현했습니다!")
    }
}

class DiImpl3 : DiInterfaceA, DiInterfaceB {
    override fun print() {

        super<DiInterfaceA>.print()
        super<DiInterfaceB>.print()

        println("D: 직접 구현했습니다!")
    }
}

interface DiInterfaceA {
    fun print() {
        println("A: 기본적으로 구현되어있는 내용입니다!")
    }
}

interface DiInterfaceB {
    fun print() {
        println("B: 기본적으로 구현되어있는 내용입니다!")
    }
}