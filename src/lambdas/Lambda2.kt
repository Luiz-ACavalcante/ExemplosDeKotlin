package lambdas

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao : Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main() {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcular(3,4)
    val resultado2 = calculadora.calcular(3,4, Multiplicacao())

    val subtração = {a: Int, b: Int -> a-b }
    val multiplicar = {a: Int, b: Int -> a*b}

    val resultado4 = calculadora.calcular(30,2,multiplicar)
    val resultado3 = calculadora.calcular(3,4 , subtração)

    println(resultado1)
    println(resultado2)
    println(resultado3)
    println(resultado4)

}