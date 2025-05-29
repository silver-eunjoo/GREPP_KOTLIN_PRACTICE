package S12

interface MiInterfaceA {
    fun a()
}
interface MiInterfaceB {
    fun b()
}

class MiImpl : MiInterfaceA, MiInterfaceB {
    override fun a() {
        TODO("Not yet implemented")
    }

    override fun b() {
        TODO("Not yet implemented")
    }
}