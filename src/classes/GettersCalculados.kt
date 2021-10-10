package classes

class Produtos(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {

    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)

}

fun main() {
    val p1 = Produtos("Ipad", 2500.30, 0.20, ativo = true)
    println(p1.precoComDesconto)

    val p2 = Produtos("Galaxy Note 7", 2526.25, 0.10, false)
    println("${p2.nome} \n\t De: R$ ${p2.preco} \n\t Por: R$ ${p2.precoComDesconto}")

    if (p2.inativo) {
        p2.preco = 0.0
        println("O preço com desconto depois de inativo o produto ${p2.precoComDesconto}")
    }

}