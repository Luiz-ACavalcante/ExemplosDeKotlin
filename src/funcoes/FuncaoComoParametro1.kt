package funcoes

class Operações {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun Calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main() {
    println(Calc(2,3, Operações()::somar))
    println(Calc(2,3, :: somar))
}