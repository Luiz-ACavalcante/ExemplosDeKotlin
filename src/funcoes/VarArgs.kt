package funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(322, 557, 8858, 5484, 568)) {
        println("$n")
    }

}