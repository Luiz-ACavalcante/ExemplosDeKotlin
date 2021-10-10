package collections

fun main() {
    val alunos = arrayListOf<String>("Amanda", "André", "Bernardo", "Carlos")

    //na primeira forma de navergar entre a liste utilizaremos a mais comum.
    //navegando apenas nos elementos da lista

    for (aluno in alunos){
        println(aluno.length)// conta quantos caracteres tem na palavra
        println(aluno)
    }

    // apartir da sengunda forma utilizaremos a navegação por indice tambem.

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}