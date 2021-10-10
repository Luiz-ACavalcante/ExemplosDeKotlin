package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(24, 8, 1995)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano} forma sem utilização de função")
    with(nascimento) { println("${dia}/${mes}/${ano}  - forma com a utilização do with" )}
    println("${nascimento.formatar()}  - utilização do metodo com função")

}