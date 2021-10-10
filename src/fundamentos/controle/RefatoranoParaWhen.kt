package fundamentos.controle

fun main() {
    val nota = 5

    when(nota){
        10 , 9 -> println("Fantástico")
        8 , 7 -> println("Parabéns")
        6 , 5 , 4 -> println("Tem com recuperar")
        in 0 .. 3 -> println("Te vejo no proximo semestre")
        else -> println("nota invalida")

    }
}