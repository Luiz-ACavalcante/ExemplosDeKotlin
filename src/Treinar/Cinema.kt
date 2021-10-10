package Treinar

import funcoes.filtrar

fun imprimirCadeira(fileira: String, cadeira: Int ):String {
    return "Sua cadeira é $cadeira na fileira $fileira"
}

fun imprimirLugares() {
    val alfabeto = "abcdefghijklmnopqrstuvwxyz"
    for( fileira in 0..25) {
        println("")
        for(cadeira in 1..15){
            print("${alfabeto.substring(fileira,fileira + 1).toUpperCase()}$cadeira  ")
        }
    }
}


fun main() {
    println("Bem vindo \n Escolha seu lugar")
    imprimirLugares()

    println("\nFileira")
    var entrada = readLine()
    println("Cadeira")
    var entrada2 = readLine()

    println(entrada?.let { entrada2?.let { it1 -> imprimirCadeira(it, it1.toInt() ) } })


}