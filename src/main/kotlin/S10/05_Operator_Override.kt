package S10

fun main() {

    val order1 = OperCoffee("T", "바닐라 라떼")
    val order2 = OperCoffee("T", "아메리카노")

    val orderList: OperCoffeeList = order1 + order2
    orderList.printList()

}

class OperCoffeeList(private val coffeeList: List<OperCoffee>) {
    fun printList() {
        for (coffee in coffeeList) {
            println("${coffee.size} 사이즈 ${coffee.type}")
        }
    }
}

class OperCoffee(val type: String, val size: String) {
    operator fun plus(other: OperCoffee) : OperCoffeeList {
        return OperCoffeeList(listOf(this, other))
    }
}

fun EfCoffeeOrder.changeSize(size: String) {
    this.size = size
    this.printPrice()
}