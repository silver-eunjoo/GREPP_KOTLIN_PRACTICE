package S16

import java.util.*

interface ConAnimal

class ConCat : ConAnimal
class ConDog : ConAnimal

class ConAnimalHospital<in T> {
    private val receiptQueue : Queue<T> = LinkedList()

    fun receipt(animal : T) {
        receiptQueue.add(animal)
    }

//    fun call() : T {
//        return receiptQueue.poll()
//    }

}

fun main() {
    var animalHospital = ConAnimalHospital<ConAnimal>()
    val catHospital : ConAnimalHospital<ConCat> = animalHospital
    val dogHospital = ConAnimalHospital<ConDog>()
}