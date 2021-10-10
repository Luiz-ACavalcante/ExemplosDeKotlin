package OO.Herança

fun main() {
    val carro = Ferrari()

    carro.acelerar()
    println(carro)

    carro.ligarTurbo()
    carro.acelerar()
    println(carro)

    carro.frear()
    carro.frear()

    println(carro)
}