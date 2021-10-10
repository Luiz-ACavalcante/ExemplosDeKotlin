package fundamentos.operadores

import java.util.*

fun main() {
    println("Banana" === "Banana")
    println(3 != 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    //Igualdade Referencial
    println("Resultado com '===' ${d1 === d2}")

    //Igualdade Estrutural
    println("Resultado com '==' ${d1 == d2}")
}