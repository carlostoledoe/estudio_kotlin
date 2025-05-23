fun main() {
    /*
    Puedes escribir una función main() que imprima estos mensajes en cuatro líneas separadas?

    Use the val keyword when the value doesn't change.
    Use the var keyword when the value can change.
    When you define a function, you define the parameters that can be passed to it.
    When you call a function, you pass arguments for the parameters.
     */

    fun escribirMensajes() {
        println("Use the val keyword when the value doesn't change.")
        println("Use the var keyword when the value can change.")
        println("When you define a function, you define the parameters that can be passed to it.")
        println("When you call a function, you pass arguments for the parameters.")
    }
    escribirMensajes()


    /*
    3. Corrección de un error de compilación
    Este programa imprime un mensaje que le notifica al usuario que recibió un mensaje de chat de un amigo.


    fun main() {
        println("New chat message from a friend'}
    }
    ¿Puedes determinar la causa raíz de los errores de compilación de este programa y corregirlos?
    ¿El código usa los símbolos apropiados para indicar la apertura y el cierre de
    la cadena y el argumento de la función?
     */

    fun main2() {
        println("New chat message from a friend")
    }
    main2()


    /*
    4. Plantillas de cadenas
    Este programa informa a los usuarios sobre la próxima oferta promocional
    de un artículo en particular. Tiene una plantilla de cadenas, que se basa en la
    variable discountPercentage para el porcentaje de descuento y la variable item para el
    artículo en oferta. Sin embargo, existen errores de compilación en el código.


    fun main() {
        val discountPercentage: Int = 0
        val offer: String = ""
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)
    }
    ¿Puedes determinar la causa raíz de esos errores y corregirlos?
    ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
     */

    fun main3() {
        var discountPercentage: Int = 0
        var offer: String
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)
    }
    main3()

    /*
    5. Concatenación de cadenas
    Este programa muestra una cantidad total de personas en una fiesta.
    Entre ellas, hay adultos y niños. La variable numberOfAdults contiene la cantidad
    de adultos en el grupo, y la variable numberOfKids, la cantidad de niños.


    fun main() {
        val numberOfAdults = "20"
        val numberOfKids = "30"
        val total = numberOfAdults + numberOfKids
        println("The total party size is: $total")
    }
    Paso 1
    ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
    Después de determinar el resultado, ejecuta el código en Kotlin Playground y, luego,
    verifica si el resultado coincide con el que se muestra.

    Pista: ¿Qué sucede cuando usas el operador + en dos cadenas?

    Paso 2
    El código funciona y, además, imprime algunos resultados, pero los resultados
    no muestran la cantidad total de personas que asistirán a la fiesta.

    ¿Puedes encontrar el problema del código y corregirlo de modo que imprima este resultado?

    The total party size is: 50
     */

    fun main4() {
        val numberOfAdults = 20
        val numberOfKids = 30
        val total = numberOfAdults + numberOfKids
        println("The total party size is: $total")
    }
    main4()


    /*
    6. Formato de mensajes
    Este programa muestra el salario total que recibe un empleado este mes.
    El salario total se divide en dos partes: la variable baseSalary, que es lo que el
    empleado recibe todos los meses, y la variable bonusAmount, que es una bonificación
    adicional otorgada al empleado.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
    ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
    Cuando ejecutas el código en el Playground de Kotlin, ¿se imprime el resultado que esperabas?
     */

    fun main5() {
        val baseSalary = 5000
        val bonusAmount = 1000
        val totalSalary = baseSalary + bonusAmount
        println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    }
    main5()

    /*
    Paso 1
    La función main() contiene un error de compilación:


    fun main() {
        val firstNumber = 10
        val secondNumber = 5

        println("$firstNumber + $secondNumber = $result")
    }
     */

    fun main6() {
        val firstNumber = 10
        val secondNumber = 5
        val result = firstNumber + secondNumber
        println("$firstNumber + $secondNumber = $result")
    }
    main6()


    /*
    Paso 2
    El código funciona, pero la lógica para sumar dos números se encuentra dentro de la
    variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo.
    En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda
    volver a usar. Para ello, actualiza el código con el que se muestra a continuación.
    Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el
    resultado de esta variable nueva con firstNumber.


    fun main() {
        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
    }

    // Define add() function below this line

    ¿Puedes definir la función add() de modo que el programa imprima este resultado?

    10 + 5 = 15
    10 + 8 = 18
     */



    fun main7() {

        fun add(num1: Int, num2: Int): Int {
            return num1 + num2
        }

        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
    }
    main7()



    // Mostrar mensaje creando una función  displayAlertMessage
    // There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.

    fun displayAlertMessage(operatingSystem: String, emailId: String): String {
        return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
    }

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))



    /*
    En esos casos, deberás especificar el nombre del sistema operativo como Unknown OS.
    Puedes optimizar aún más el código para que no necesites pasar el argumento Unknown OS
    cada vez que se llame a la función.

    ¿Puedes encontrar una manera de optimizar el código con esta información de modo que imprima
    este resultado?

    There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

    There's a new sign-in request on Windows for your Google Account user_two@gmail.com.

    There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com
     */


    fun main9() {

        fun displayAlertMessage(operatingSystem: String  = "Unknown OS", emailId: String): String {
            return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
        }

        val firstUserEmailId = "user_one@gmail.com"

        // The following line of code assumes that you named your parameter as emailId.
        // If you named it differently, feel free to update the name.

        println(displayAlertMessage(emailId = firstUserEmailId))
        println()

        val secondUserOperatingSystem = "Windows"
        val secondUserEmailId = "user_two@gmail.com"

        println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
        println()

        val thirdUserOperatingSystem = "Mac OS"
        val thirdUserEmailId = "user_three@gmail.com"



        println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
        println()
    }
    main9()


    // ¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables
    // utilizados en este programa según las prácticas recomendadas?

    fun main10() {
        fun pedometerStepsToCalories(numberOfSteps: Int): Double {
            val caloriesBurnedForEachStep = 0.04
            val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
            return totalCaloriesBurned
        }

        val steps = 4000
        val caloriesBurned = pedometerStepsToCalories(steps)
        println("Walking $steps steps burns $caloriesBurned calories")
    }
    main10()


    // Compración de dos números

    fun comparadorDosNumeros(timeSpentToday: Int,  timeSpentYesterday: Int): Boolean {
        //  return timeSpentToday > timeSpentYesterday
       return if (timeSpentToday > timeSpentYesterday) {
           true
       } else {
           false
       }
    }

    comparadorDosNumeros(300, 250)


    // Corrección:

    fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
        return timeSpentToday > timeSpentYesterday
    }

    fun main13() {
        println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
        println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
        println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
    }


    /*
    fun main() {
        println("City: Ankara")
        println("Low temperature: 27, High temperature: 31")
        println("Chance of rain: 82%")
        println()

        println("City: Tokyo")
        println("Low temperature: 32, High temperature: 36")
        println("Chance of rain: 10%")
        println()

        println("City: Cape Town")
        println("Low temperature: 59, High temperature: 64")
        println("Chance of rain: 2%")
        println()

        println("City: Guatemala City")
        println("Low temperature: 50, High temperature: 55")
        println("Chance of rain: 7%")
        println()
    }
    */


    // Corrección

    fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
        println("City: $cityName")
        println("Low temperature: $lowTemp, High temperature: $highTemp")
        println("Chance of rain: $chanceOfRain%")
        println()
    }

    fun main12() {
        printWeatherForCity("Ankara", 27, 31, 82)
        printWeatherForCity("Tokyo", 32, 36, 10)
        printWeatherForCity("Cape Town", 59, 64, 2)
        printWeatherForCity("Guatemala City", 50, 55, 7)
    }
    main12()


}