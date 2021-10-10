package fundamentos.desafios
import fundamentos.desafios.*


fun main() {

    println("Digite qual a escala da temperatura")
    println("1 para Celsius \n2 para Kevin \n3 para Fahrenheit ")
    var entrada = readLine()

    val escalaInicailInt = entrada?.toInt() ?: 0

    println("Digite qual a escala que deseja converter")
    println("1 para Celsius \n2 para Kevin \n3 para Fahrenheit ")
    entrada = readLine()

    val escalaFinalInt = entrada?.toInt() ?: 0

    println("Digite a Temperatura que deseja:")
    entrada = readLine()

    val temperaturaDouble = entrada?.toDouble() ?: 0.0

    when (escalaInicailInt){
        0 -> println("indisponivel")
        1 -> when(escalaFinalInt){
            0 -> println("Indisponivel")
            1 -> println("Escalas Iguais")
            2 -> println("A temperatura é ${CCelsiusKelvin(temperaturaDouble)} K")
            3 -> println("A temperatura é ${CCelsiusFahrenheit(temperaturaDouble)} F")
        }
        2 -> when(escalaFinalInt){
            0 -> println("Indisponivel")
            1 -> println("A temperatura é ${CKelvinCelsius(temperaturaDouble)} C")
            2 -> println("Escalas Iguais")
            3 -> println("A temperatura é ${CKelvinFahrenheit(temperaturaDouble)} F")
        }
        3 -> when(escalaFinalInt){
            0 -> println("Indisponivel")
            1 -> println("A temperatura é ${CFahrenheitCelsius(temperaturaDouble)} C")
            2 -> println("A temperatura é ${CFeahrenheitKelvin(temperaturaDouble)} K")
            3 -> println("Escalas Iguais")
        }


    }


}