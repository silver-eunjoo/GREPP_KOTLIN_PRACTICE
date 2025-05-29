package io.silver

// public, protected, private, internal

public val OTHER_PUBLIC_VALUE: String = "PUBLIC_VALUE"
internal val OTHER_INTERNAL_VALUE: String = "INTERNAL_VALUE"
private val OTHER_PRIVATE_VALUE: String = "PRIVATE_VALUE"

public fun otherpublicFunction() : Unit {
    println("Other Module Public Function!")
}

internal fun otherinternalFunction() {
    println("Other Module Internal Function!")
}

private fun otherprivateFunction() {
    println("Other Module Private Function!")
}

public class OtherPublicType
private class OtherPrivateType
internal class OtherInternalType

open class OtherPublicClass {
    public fun publicMethod() {
        println("Public Method!")
    }

    internal fun internalMethod() {
        println("Internal Method!")
    }

    private fun privateMethod() {
        println("Private Method!")
    }

    protected fun protectedMethod() {
        println("Protected Method!")
    }
}

class OtherChildClass : OtherPublicClass() {

    // public private internal protected
    fun callTest() {
        println("OtherChildClass.callTest")

        publicMethod()
//        privateMethod() (X)
        internalMethod()
        protectedMethod()
    }
}