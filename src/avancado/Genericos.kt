package avancado

class Caixa<TIPO>(val objeto: TIPO) {
    private val objetos = ArrayList<TIPO>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: TIPO) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar = Caixa("Caneta")
    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Borracha")

    val numeros = Caixa(1)
    numeros.adicionar(2)
    numeros.adicionar(3)
    numeros.adicionar(4)

    println(numeros)
    println(materialEscolar)
}