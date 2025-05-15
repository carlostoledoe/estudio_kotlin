fun main() {
    var count: Int = 10
    count += 3
    println(count)

    val languageName: String = "Carlos"
    // languageName = "Juan" ERROR
    println(languageName)





    // Inferencia de tipo

    val lastname= "Toledo" // Infiere el tipo string
    val upperCaseLastname = lastname.uppercase()
    println(upperCaseLastname)

    // lastname.inc() (Error, función .inc no es para String)



    //Seguridad Nula

    // val nombre: String = null  (Error: Null cannot be a value of a non-null type 'String')
    val nombre: String? = null
    println(nombre)




    // Condicionales

    count = 51

    if (count == 22) {
        println("Es el número")
    } else if (count > 50) {
        println("Es mayor a 50")
    } else {
        println("No es el número")
    }




    // Expresiones condicionales, para no repetir. No es necesario Return

    val answerString: String = if (count == 22) {
        "Es el número"
    } else if (count > 50) {
        "Es mayor a 50"
    } else {
        "No es el numero"
    }
    println(answerString)




    // Uso de When para reemplazar else if

    val respuesta = when {
        count == 22 -> "Es el número"
        count > 50 -> "Es mayor a 50"
        else -> "No es el número"
    }
    println(respuesta)




    var name: String? = null
    // name = "Juan"
    if (name != null) {
        println(name.uppercase())
    }
}