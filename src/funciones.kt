import com.sun.tools.javac.Main

// Se usa la palabra clave de fun seguida de un nombre de función.
// A continuación, define los tipos de entrada que tu función acepta, si corresponde,
// y declara el tipo de resultado que muestra.

fun main() {

    val count = 42
    fun generateAnswerString(countThreshold: Int): String {
        val answerString = if (count > countThreshold) {
            "I have the answer"
        } else {
            "The answer eludes me"
        }
        return answerString
    }

    val answerString = generateAnswerString(41)
    println(answerString)




    // Simplifcada
    fun generadoRespuesta(dato: Int): String {
        return if (count > dato) {
            "Número es mayor que $count"
        } else {
            "Número es menor que $count"
        }
    }
    val respuesta = generadoRespuesta(44)
    println(respuesta)




    // Más simplificada
        fun creadorRespuesta(dato: Int): String = if (dato > count) {
        "El nuevo número es mayo a $count"
    } else {
        "El nuevo número es menor a $count"
    }
    val respuesta2 = creadorRespuesta(44)
    println(respuesta2)



    // Funciones anónimas (sin nombre)
    val largoStringFunc: (String) -> Int = { input ->
        input.length
    }

    val largoString: Int = largoStringFunc("Carlos")
    println("El largo es $largoString")



    // Funciones de orden superior: Una función puede tomar otra función como argumento.
    // Las funciones que usan otras funciones como argumentos se llaman funciones de
    // orden superior. Este patrón es útil para la comunicación entre los componentes

    fun stringMapper(str: String, mapper: (String) -> Int): Int {
        // Invoke function
        return mapper(str)
    }

    val result = stringMapper("Paralelepipedo") {input ->
        input.length
    }
    println(result)

    // La función stringMapper() toma un objeto String además de una función que deriva en un
    // valor de Int a partir de un objeto String que pasas a la función.
    // Para llamar a stringMapper(), puedes pasar un objeto String y una función que satisfaga
    // el otro parámetro de entrada, es decir, una función que tome un objeto String como
    // entrada y muestre un objeto Int.

}