package avancado

fun fat(x: Int): Int {
    tailrec fun fattail(y: Int, z: Int): Int {
        return if (y == 0) z else fattail(y - 1, y * z)
    }
    return fattail(x, 1)
}

fun main() {
    println("Resultado: ${fat(8)}")
}