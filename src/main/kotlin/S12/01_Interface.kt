package S12

fun main() {
    val instanceA: OopA = OopAImpl()

    instanceA.a()
    instanceA.b()
//    instanceA.c()

}

interface OopA {
    public abstract fun a()
    fun b()
}

class OopAImpl : OopA {
    override fun a() {
        println("A")
    }

    override fun b() {
        println("B")
    }
}