package fundamentos.controle.Do

fun main() {
    var opcao: Int = 0

    do {
        println("Digite o número escolhido:")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while (opcao != -1)
    println("Até a próxima")
}