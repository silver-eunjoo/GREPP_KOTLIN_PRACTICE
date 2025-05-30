package S13

// Data Transfer Object
// Getter, Setter, equals, hashCodes, copy

// 주생성자에 최대 1개의 매개변수를 가져야 한다.
// val, var로 생성된 변수여야 한다.
// abstract 키워드를 붙일 수 없다. (open, sealed도 x)
data class MemberLabel(var name: String, val code : String)

data class CustomerInfo(var name: String, var grade: String) {
    init {
        if(grade == "GOLD") name = "*${name}*"
    }
}

fun main() {

    val member1 = MemberLabel("MemberA", "MEMBER_A")
    val member2 = MemberLabel("MemberA", "MEMBER_A")

    println(member1 == member2)
    println(member1 === member2)

    println("member1.hashCode() = ${member1.hashCode()}")
    println("member21.hashCode() = ${member2.hashCode()}")

    val member3 = member2.copy("MemberB")
    val member4 = member2.copy("MemberB", "MEMBER_B")
    val member5 = member2.copy(code="MEMBER_B")

    println(member2.toString())
    println(member3.toString())
    println(member4.toString())

    // 디스트럭처링

//    var member1Name = member1.name
//    val member1Code = member1.code

    val (member1Name, member1Code) = member1

    println("member1Name = ${member1Name}")
    println("member1Name = ${member1Code}")

    val (member2Name, _) = member2
    val (_, member2Code) = member2

    println("member2Name = ${member2Name}")
    println("member2Code = ${member2Code}")

    val member3Name = member3.component1()

    println("member3Name = ${member3Name}")
}