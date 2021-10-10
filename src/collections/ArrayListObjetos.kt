package collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(Fruta("Banana", 1.56),
        Fruta("Morango", 3.55),
        Fruta("Kiwi", 5.65))

    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.size) // Obtem o tamanho da ArrayList
    println(frutas.contains(Fruta("Banana", 1.56)))
        // Verifica se o que foi escrito está dentro da arrayList
        // Lembrando que por ser uma data class o equals ja esta implementado.
    println(frutas.distinctBy { it.preco })
        // Verifica se há elementos distintos(Diferentes) dentro da arrayList

}




