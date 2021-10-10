package fundamentos.desafios

fun main() {
        println("Digite sue nome:")
        var entrada = readLine()
        val nome: String = entrada ?: "Nulo"

        println("Digite quantidade de anos:")
        entrada = readLine()

        val anos: Int = entrada?.toInt() ?: 0

        println("Digite quantidade de meses:")
        entrada = readLine()

        val meses: Int = entrada?.toInt() ?: 0

        println("Digite quantidade de dias:")
        entrada = readLine()

        val dias: Int = entrada?.toInt() ?: 0


        println("Olá $nome sua idade em dias e de ${calDias(dias, meses, anos)} dias")


}