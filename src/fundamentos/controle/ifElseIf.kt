package fundamentos.controle

fun main() {
    val nota = 8.3

    // usando operador range

    if (nota in 9.0..10.0) {
        println("Fantastico")
    } else if (nota in 7.0 .. 8.9) {
        println("Parabéns")
    } else if (nota in 4.0..6.9) {
        println("Tem como recuperar")
    } else if (nota in 0.0..3.9) {
        println("Te vejo no proximo semestre")
    } else {
        println("Nota inválida")
    }
}