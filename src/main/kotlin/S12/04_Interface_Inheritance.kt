package S12

interface IhInterfaceA
interface IhInterfaceB

interface IhInterfaceC : IhInterfaceA, IhInterfaceB

class IhImpl : IhInterfaceC

fun main() {

    val a: IhInterfaceA = IhImpl()
    val b: IhInterfaceB = IhImpl()
    val c: IhInterfaceC = IhImpl()
    val d : IhImpl = IhImpl()


}
