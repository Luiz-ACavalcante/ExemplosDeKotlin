package classes

// Erro!! Kotlin: val cannot be reassigned

//fun porReferencia(velocidade: Int) {
//velocidade++ - quando o parametro e passado por referencia ele assume o tipo val de constante
// por isso não e permitido que se altere
//}


data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0 )

fun porReferencia(carro: Carro){
    carro.velocidade++
}

fun main() {
    var carro1 = Carro("Ford", "Fusion")

    var carro2 = carro1

    carro2.modelo = "Edge"

    println(carro1)

    carro1 = Carro("Audi", "A4")

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)
}