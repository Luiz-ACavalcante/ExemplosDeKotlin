package collections

fun main() {
    val matriz = Array(3) { arrayOfNulls<Int>(3) }

    for (i in 0..2) {
        var fator: Int = if (i == 0) 1 else if (i == 1) 4 else 7
        for (e in 0..2) {
            matriz[i][e] = fator + e // forma de atribuir um valor a matriz
            println(matriz[i][e])
        }
    }

    for ((linha /* indice */, linhaArray /* valor*/) in matriz.withIndex()) {
        for ((coluna, valor) in linhaArray.withIndex()) {
            println("A matriz[$linha] [$coluna] - ${matriz[linha][coluna]} == $valor")
        }
    }

    matriz.forEach { linha ->
        linha.forEach { valor ->
            println("valor da matriz é $valor")
        }
    }
}