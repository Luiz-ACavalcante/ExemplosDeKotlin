package classes

var diretamentonoArquivo: String = "Bom dia"

fun toplevel() {
    val local = "Dentro de uma função"
    println("Utilizando variaveis $local")
    println("$diretamentonoArquivo")
}

class Coisa {
    var variavelDeInstancia: String = "Boa noite - dentro da classe"

    companion object {
        @JvmStatic
        val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3 ){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeBloco , $variavelDeInstancia, $constanteDeClasse, $diretamentonoArquivo " )
        }
    }
}


fun main() {
    toplevel()
    Coisa().fazer()

    println(Coisa.constanteDeClasse)

}
