package fundamentos.operadores

fun main() {
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4/ v1
    val multiplicacao = v1 * v2
    val modulo = v1 % 2

    println("A soma dos valores: $soma \n " +
            "A subtração dos valores: $subtracao \n" +
            "A divisão dos valores: $divisao \n " +
            "A multiplicação dos valores: $multiplicacao \n " +
            "O resto do valor 1 dividido por 2: $modulo")

}
