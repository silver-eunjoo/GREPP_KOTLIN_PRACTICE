package S15

open class VeAnimal

class VeCat: VeAnimal()
class VeDog: VeAnimal()

class VeAnimalShelter<T> {
    fun service(animal : T) {

    }
}

fun main() {
    val cat = VeCat()
    val animal = cat

    val catShelter = VeAnimalShelter<VeCat>()
//    val animalShelter : VeAnimalShelter<VeAnimal> = catShelter

//    val dog = VeDog()
//    animalShelter.service(dog)
}