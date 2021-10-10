package collections

fun main() {
    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    map.put(60070080090, "Pedro Filho0") // substituição do valor
    // acima podemos ver a estrutura para poder inserir dados em map

    for (par in map){
        println(par)
    }

    for (par in map.entries){
        println(par)
    }// faz a mesma função do for acima

    for (nome in map.values){
        println(nome)
    }// values faz com que imprima só os valores de map

    for (cpf in map.keys){
        println(cpf)
    }// keys faz com que imprima só as chaves de map

    for ((cpf/* chave*/, nome /* valor */ )in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()// conta a quanridade de elementos que tem dentro de map

    map.get(30040050060)?.print() ?: println("Valor não encontrado")
    map[300400500]?.print() ?: println("Valor não encontrado")
    // busca dentro de map a chave declarada, os dois métodos fazem tem o mesmo fim,
    // sendo o segundo o mais indicado

    map.contains(30040050060).print()
    // busca dentro de map a chave e print true ou false

    map.remove(30040050060)?.print() ?: "Objeto não encontrado".print()
    // remove um objeto de map

    map.clear() // limpa map
    map.isEmpty().print()// retorna se map está vazio
}