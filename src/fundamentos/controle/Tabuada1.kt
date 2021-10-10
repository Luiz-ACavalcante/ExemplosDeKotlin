package fundamentos.controle

fun main() {
    println("Informe o  numero")
    var entrada = readLine()

    var num = entrada?.toIntOrNull() ?: 0

    for(i in 0 .. 10){

        println("$i X $num = ${ i * num}")

    }
}