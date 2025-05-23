fun main() {
    println("Dime que pasa!!!\nehh pasala!!!")
    println("-".repeat(12))
    println("Uno"); println("Dos"); println("Tres")

    val nombre = "Carlos"
    val apellido = "Toledo"
    val edad = 50

    // Concatencación
    val persona = "La \"persona\" es " + nombre + " " + apellido + " y su edad es " + edad
    println(persona)

    /*
     * Comentario de
     * varias lineas
     */


    // Operaciones con variables

    val unreadCount = 5
    var readCount = 100
    readCount++ // es igual a readCount = readCount + 1, ya,también se puede usar readCount--

    println("You have ${unreadCount + readCount} total messages in your inbox.")

}