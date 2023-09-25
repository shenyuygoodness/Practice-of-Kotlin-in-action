class Person(val name: String, val age: Int){
    fun introduce(){
        println("My name is $name and I am $age years old")
    }
}
class Car(val make: String, val model: String, val year: Int){
    fun Drive(){
        println("Drive $year, $model, $year car")
    }
}

fun main(){
    val person1 = Person("Bob", 34)
    val person2 = Person("Alice", 78)
    val person3 = Person("Lois", 32)

    person1.introduce()
    person2.introduce()
    person3.introduce()
}