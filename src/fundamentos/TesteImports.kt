package fundamentos

import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.Cara
import fundamentos.pacoteB.subtracao
import fundamentos.pacoteA.simplesFuncao as funcaoSimples

fun main() {
    println(funcaoSimples("ok"))
    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(Cara)

    println("${soma(2, 3)} ${subtracao(4, 6)}")

}