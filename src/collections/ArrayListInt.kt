package collections

fun main() {
    val pares = arrayListOf<Int>(2, 4, 6)
    val impares = intArrayOf(1, 3, 5)
    val sequencia = arrayListOf(7, 8, 9)
    val con = impares.union(pares).union(sequencia).sorted()

    for (n in impares.union(pares).sorted()) {
        println("$n ")
    }
    println(con)
}