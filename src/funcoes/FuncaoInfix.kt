package funcoes

class Produto(val nome: String, val preco: Double)
class Carro(val marca: String, val potencia: Double)

infix fun Produto.maisCaroQue(Produto: Produto): Boolean = this.preco > Produto.preco

infix fun Carro.motorMaisPotente(Carro: Carro): Boolean = this.potencia > Carro.potencia

fun main() {
    val p1 = Produto("Ipad", 2546.23)
    val p2 = Produto("Borracha", 3.56)

    println(p1 maisCaroQue p2)
    println(p1.maisCaroQue(p2))

    val c1 = Carro("BMW", 5.6)
    val c2 = Carro("Mitsubishi", 5.8)
    println(c1 motorMaisPotente c2)


}