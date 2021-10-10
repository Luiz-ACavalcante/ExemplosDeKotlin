package lambdas

class Calculadora2 {
    var resultado = 0


    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(Valor: Int) {
        resultado += Valor
    }
}

fun main() {
    val calculadora = Calculadora2()

    calculadora.apply { soma( 3, 5 ) }.apply { add(8) }. apply { println(resultado) }

    calculadora.apply {
//        resultado = 0
        soma(7,8)
        add(6)
         println(resultado)
    }

    with(calculadora){
//        resultado = 0
        soma(7,5)
        add(6)
        println(resultado)
    }


}