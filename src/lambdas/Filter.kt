package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Joyce", 8.5),
        Aluno("Ricarco", 5.7),
        Aluno("Caio", 4.5),

        )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
        .sortedBy { it.nota }

    println(aprovados)
}