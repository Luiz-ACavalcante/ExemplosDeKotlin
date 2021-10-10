package classes

class ItemDePedido(val nome: String, var preco: Double) {
    companion object {
        //Tudo que for colocado dentro do companion object será tratado como um membro static.
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic
        var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco * (1 - desconto)
    }
}

fun main() {
    val item1 = ItemDePedido.create("Tv 50' ", 2658.56)
    val item2 = ItemDePedido("Processador", 250.00)

    ItemDePedido.desconto = 0.10

println(item1.precoComDesconto())
println(item2.precoComDesconto())
}
