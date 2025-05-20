class Car(val wheelNames: List<String>) {
    val wheels: List<String> = wheelNames
}

fun main() {
    val car = Car(listOf("Rueda01", "Rueda02", "Rueda03", "Rueda04"))
    val wheels = car.wheels
    println("Las ruedas del coche son: $wheels")
}