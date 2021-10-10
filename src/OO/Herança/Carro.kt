package OO.Herança

open class Carro(
    val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0
){
    protected fun alterarVelocidadeEm(velocidade: Int){
        val novaVelocidade = velocidadeAtual + velocidade
        velocidadeAtual = when(novaVelocidade){
            in 0..velocidadeMaxima -> novaVelocidade
            in velocidadeMaxima + 1 .. Int.MAX_VALUE -> velocidadeMaxima
            else -> 0 /* quando utilizado um when como expressão
             ele sempre tem que ter o else para o caso de não haver valor definido */
        }
    }

    open fun acelerar(){
        alterarVelocidadeEm(10)
    }

    open fun frear() {
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual km/h."
    }
}