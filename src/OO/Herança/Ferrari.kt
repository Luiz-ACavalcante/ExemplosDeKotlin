package OO.Herança

class Ferrari: Carro(350),Esportivo{
    override var turbo: Boolean = false
        get() = field
        set(value) {field = value}

    override fun acelerar() {
        alterarVelocidadeEm(if (turbo)50 else 25)
    }

    override fun frear() {
        alterarVelocidadeEm(-25)
    }

}