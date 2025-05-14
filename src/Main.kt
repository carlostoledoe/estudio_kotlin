fun main () {
    // Comentario en línea

    /*
    Comentarios en
    varias lineas
     */

    println("Hola Mundo!")

    print("Hola, ") // Imprime y NO agrega salto de linea
    println("Carlos") // Imprime y agrega salto de linea


    // Variables
    var myString = "Esto es una cadena de texto"
    myString = "Aquí cambió el valor"
    // myString = 6 Error
    println(myString)

    println("Este es el valor de la variable myString ---> " + myString )
    println("Este es el valor de la variable myString ---> $myString ") // Interpolación


    var myString2: String = "Esta es otra cadena" // Tiparlo
    println(myString2)

    var myInt = 7 // lo mismo myInt: Int
    myInt = myInt + 4
    println(myInt)
    println(myInt - 1)

    var myInt2: Int = 5
    println(5)

    var myDouble = 6.5
    println(myDouble)

    myDouble = 6.6 // Asignado otro valor
    println(myDouble)

    var myDouble2: Double = 6.5
    var myFloat = 6.5f  // Float, usa 32 bits, ligeramente más rapido

    var myBool = true
    myBool = false
    println(myBool)


    // Constantes

    val myConst = "Mi propiedad constante"
    // myConst = "Mi nueva propiedad"  Error


    // Control de flujo

    myInt = 100
    myString = "Hola"

    if (myInt == 11 && myString == "Hola") {
        println("El valor es 11")
    } else if (myInt == 10 || myString == "Hola"){
        println("El valor es 10")
    }
    else {
        println("El valor es otro")
    }


    // Lista

    var myList = listOf<String>("Carlos", "Toledo", "Chile") // No es necesario poner el tipo. Son inmutales
    println(myList)
    println(myList[1])

    val myList2 = mutableListOf("Pedro", "Juan", "Diego") // Lista mutable
    myList2.add("Pepe")
    println(myList2)


    // Sets
    val mySet = setOf("Pedro", "Juan", "Diego", "Juan") // Para guardar datos sin importar el orden, funciona más rapido, pero admiten duplicados
    println(mySet)


    // Mapas (clave, valor)

    val myMap = mutableMapOf("Carlos" to 71, "María" to 33, "Juan" to 24)
    myMap.put("Claudia", 67)
    println(myMap)
    println(myMap["Carlos"])


    // Bucles

    println("Bucles")
    println()

    for (value in myList) {
        println(value)
    }

    for (value in mySet ){
        println(value)
    }

    for (value in myMap) {
        println(value)
    }


    var myCounter = 0

    while (myCounter < myList.count()) {
        println(myList[myCounter])
        myCounter++ // lo mismo myCounter += 1
        myFunction()

    }


    // Opcionales

    var myOptional: String? = null
    println(myOptional)
    myOptional = "Cadena cambiada"
    println(myOptional)

    // Funciones

    myFunction()
    myFunction()
    myFunction()



    // Clases

    var myClass = MyClass("Carlos", 71)
    println(myClass.name)
}


fun myFunction () {
    println("Se ha llamado a una función")
}



// Clases

// El contructor va directamente en la clase
class MyClass (val name: String, val age: Int) {

}