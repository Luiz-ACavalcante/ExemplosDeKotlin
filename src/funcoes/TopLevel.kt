package funcoes

fun min(a: Int, b: Int): Int = if (a < b) a else b

fun main() {
    println("O menor valor é ${min(35,25)}")
}