package Treinar

data class Fruta(val nome: String, var Preco: Double, var Estoque: Int)

fun main() {
    var frutas = arrayListOf(Fruta("Banana", 4.55, 5),
        Fruta("Maça", 8.98, 10),
        Fruta("Laranja", 8.45, 80))

    for (item in frutas) {
        println("A ${item.nome} tem o preço de R$: ${item.Preco} quantidade em estoque de ${item.Estoque}")
    }


}