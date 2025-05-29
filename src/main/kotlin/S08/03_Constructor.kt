package S08

// main
fun main() {

    val carA = AClsCar("붕붕이", 10, true)
    val carB = BClsCar("성찬이", 15, true)
    val carC = AClsCar("앤토니", 20, false)

    carA.intro()
    carB.intro()
    carC.intro()

    val carD = DClsCar(name ="쌩쌩이", color="검정색")
    println("carD.name = ${carD.name}")

    CoffeeOrderLv1(name = "아메리카노", size = "T", extraShot = true, extraCream = false)

//    CoffeeOrderLv2(name = "아메리카노", size = "A", extraShot = true, extraCream = false)

    CoffeeOrderLv3(name = "아메리카노", size = "T", extraShot = true, extraCream = false)

}


class AClsCar constructor(
    name: String, size: Int, isGasoline: Boolean
){

    val name: String = name
    val size: Int = size
    val isGasoline: Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈" 크기의 "가솔린 / "디젤" 차입니다.
        println("$name 이름의 $size 크기의 ${if (isGasoline) "가솔린" else "디젤"} 차 입니다.")
    }
}

class BClsCar (
    name: String, size: Int, isGasoline: Boolean
){

    val name: String = name
    val size: Int = size
    val isGasoline: Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈" 크기의 "가솔린 / "디젤" 차입니다.
        println("$name 이름의 $size 크기의 ${if (isGasoline) "가솔린" else "디젤"} 차 입니다.")
    }
}

class CClsCar (
    val name: String, val size: Int, val isGasoline: Boolean
){

//    val name: String = name
//    val size: Int = size
//    val isGasoline: Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈" 크기의 "가솔린 / "디젤" 차입니다.
        println("$name 이름의 $size 크기의 ${if (isGasoline) "가솔린" else "디젤"} 차 입니다.")
    }
}

class DClsCar {

    val name: String
    val color: String
    val size: Int
    val isGasoline: Boolean

    constructor() {
        this.name = "D Class Car"
        this.color = "Black"
        this.size = 10
        this.isGasoline = true
    }
    constructor(name: String) {
        this.name = name
        this.color = "Black"
        this.size = 10
        this.isGasoline = true
    }

    constructor(name: String, color: String) {
        this.name = name
        this.color = color
        this.size = 10
        this.isGasoline = true
    }

    constructor(name: String, color: String, size: Int) {
        this.name = name
        this.color = color
        this.size = size
        this.isGasoline = true
    }

    constructor(name: String, color: String, size: Int, isGasoline: Boolean) {
        this.name = name
        this.color = color
        this.size = size
        this.isGasoline = isGasoline
    }

}

class ConsMember(idCard: String) {
    var idCard: String = idCard
    var name:String = ""
    var address: String = ""

    constructor(name: String, address: String, idCard: String) : this(idCard) {
        this.name = name
        this.address = address
    }
}

class CoffeeOrderLv1(val name: String, var size:String, val extraShot: Boolean, val extraCream: Boolean) {
    var price = 0

    init {

        size = when (size) {
            "T" -> "Tall"
            "G" -> "Grande"
            "V" -> "Venti"
            else -> "Tall"
        }

        price = when(size) {
            "Tall" -> 3500
            "Grande" -> 4000
            "Venti" -> 5000
            else -> 3500
        }

        if (extraShot) {
            price += 1000
        }

        if(extraCream) {
            price += 500
        }

        println("""
            주문한 커피
            이름 :        $name
            사이즈 :      $size
            샷 추가 :     ${if (extraShot) "추가" else "추가 안함"}
            크림 추가 :    ${if (extraCream) "추가" else "추가 안함"}
            가격 :        $price
        """.trimIndent())

        println()

    }
}


class CoffeeOrderLv2(val name: String, var size:String, val extraShot: Boolean, val extraCream: Boolean) {
    var price = 0

    init {

        if (size !in arrayOf("T", "G", "V")) {
            throw IllegalArgumentException("사이즈는 T, G, V중 하나여야 합니다..")
        }

        size = when (size) {
            "T" -> "Tall"
            "G" -> "Grande"
            "V" -> "Venti"
            else -> "Tall"
        }

        price = when (size) {
            "Tall" -> 3500
            "Grande" -> 4000
            "Venti" -> 5000
            else -> 3500
        }

        if (extraShot) {
            price += 1000
        }

        if (extraCream) {
            price += 500
        }

        println(
            """
            주문한 커피
            이름 :        $name
            사이즈 :      $size
            샷 추가 :     ${if (extraShot) "추가" else "추가 안함"}
            크림 추가 :    ${if (extraCream) "추가" else "추가 안함"}
            가격 :        $price
        """.trimIndent()
        )

        println()

    }
}

class CoffeeOrderLv3(val name: String, var size:String, val extraShot: Boolean, val extraCream: Boolean) {
    var price = 0

    init {
        println("사이즈는 무엇으로 하시겠어요?")

        if ( size !in arrayOf("T", "G", "V") ) {
            throw IllegalArgumentException("사이즈는 T, G, V중 하나여야 합니다..")
        }
        size = when (size) {
            "T" -> "Tall"
            "G" -> "Grande"
            "V" -> "Venti"
            else -> "Tall"
        }
        println("$name 을 ${size}로 하겠습니다!")
        println()
    }

    init {


        price = when(size) {
            "Tall" -> 3500
            "Grande" -> 4000
            "Venti" -> 5000
            else -> 3500
        }

        println("$size 가격은 $price 원입니다.")
        println()

    }

    init {
        println("샷 추가 하시겠어요?")

        if (extraShot) {
            price += 1000
            println("샷 추가하셔서 ${price}원입니다!")
        } else {
            println("샷 추가 안 하시면 ${price}원입니다!")
        }

    }

    init {
        println("크림은 추가 하시겠어요?")
        if(extraCream) {
            price += 500
            println("크림 추가하셔서 ${price}원입니다!")
        } else {
            println("크림 추가 안 하시면 ${price}원입니다!")
        }
        println()
    }

    init {
        println("주문 내용 확인하겠습니다!")

        println("""
            주문한 커피
            이름 :        $name
            사이즈 :      $size
            샷 추가 :     ${if (extraShot) "추가" else "추가 안함"}
            크림 추가 :    ${if (extraCream) "추가" else "추가 안함"}
            가격 :        $price
        """.trimIndent())

        println()
    }
}