package S08

import S08.inner.*
import io.silver.*

fun main() {

    println("PUBLIC_VALUE = ${PUBLIC_VALUE}")
    println("INTERNAL_VALUE = ${INTERNAL_VALUE}")
//    println("PRIVATE_VALUE = ${PRIVATE_VALUE}")

    println("OTHER_PUBLIC_VALUE = ${OTHER_PUBLIC_VALUE}")
//    println("OTHER_INTERNAL_VALUE = ${OTHER_INTERNAL_VALUE}")
//    println("OTHER_PRIVATE_VALUE = ${OTHER_PRIVATE_VALUE}")

    publicFunction()
    internalFunction()
//    privateFunction()

    otherpublicFunction()
//    otherInternalFunction()
//    otherPrivateFunction()

    val pubType: PublicType = PublicType()
    val interType: InternalType = InternalType()
//    PrivateType()

    val otherPubType: OtherPublicType = OtherPublicType()
//    val otherInterType: OtherInternalType = OtherInternalType()
//    val otherPrivType : OtherPrivateType = OtherPrivateType()

    val publicClass = PublicClass()
    publicClass.publicMethod()
    publicClass.internalMethod()
//    publicClass.protectedMethod()
//    publicClass.privateMethod()

    val othPubClass : OtherPublicClass = OtherPublicClass()
    othPubClass.publicMethod()
//    othPubClass.internalMethod()
//    othPubClass.protectedMethod()

    val childClass: ChildClass = ChildClass()
    childClass.callTest()

    val otherChildClass : OtherChildClass = OtherChildClass()
    otherChildClass.callTest()

}
