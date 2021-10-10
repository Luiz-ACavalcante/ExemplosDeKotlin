package fundamentos.controle

fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou"

fun main() {
    println("O aluno ${obterResultado(8.5)}")
}