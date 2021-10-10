package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    // Nesta 3 definiços utilizamos o this para definir o que e do contructor do que é da classe
    }
}

fun main() {
    val filme = Filme("Poderoso Chefão", 1972, "Drama")
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}")
}