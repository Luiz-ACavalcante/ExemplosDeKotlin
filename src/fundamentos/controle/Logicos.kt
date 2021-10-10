package fundamentos.controle

fun main() {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50 : Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32 : Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv32)
    println(comprouTv50)

    // Operador Unário
    if (!comprouSorvete){
        println("A saúde agradeçe")
    }
}
