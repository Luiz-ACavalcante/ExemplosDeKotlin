package OO.Herança

import collections.print

open class Animal(val nome: String) // Open define que a classe e aberta para extensão

class Cachorro : Animal { // definição de uma subclasse da classe animal ...
    private val altura: Double // private define que a val seja somente acessada dentro da classe cachorro

    constructor(nome: String, altura: Double) : super(nome) { // sempre que for chamado o construtor da classe filha
        //deve ser chamado tambem o construtor da classe pai
        this.altura = altura
    }

    constructor(nome: String) : this(nome, 0.0)// dessa forma o construtor chama outro construtor

    override fun toString(): String = "$nome tem $altura cm de altura."
}

fun main() {
    val dogAlemao = Cachorro("Spike",80.5)
    val yorshire = Cachorro("Lady Di")

    yorshire.print()
    dogAlemao.print()
}