package collections

fun main() {
    val numeros = arrayListOf<Int>(1, 2, 3, 4, 5)
    val string = arrayListOf<String>("Rafael", "Pedro", "Leandro", "Gustavo")

    val uniao = numeros + string // sobrecarga de operadores

    for (item in uniao){
        println(item)
    }
}