package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Consul", 320)
    val g2 = Geladeira("Consul", 320)

    println(g1 == g2) //Lembrando que dois sinais de iguais e o equivalente ao equals

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2) //equals
    println(tv1 === tv2) // verifica os endereços de memoria
    println(tv1.toString()) // tem a função toString bem defnida sem precisar de tratamento
    println(tv2.copy())

    //Destructuring em data class
    val (marca, pol) = tv2

    println("$marca , $pol' ")
}