package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Monstros SA", 2001, "Infatil")
    println("${filme.nome} foi lançado em ${filme.anoLancamento}")
}