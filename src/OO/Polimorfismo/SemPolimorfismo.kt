package OO.Polimorfismo

class Feijao(val peso: Double)
class Arroz(val peso: Double)
class Pessoa(var peso: Double) {
    fun comer(feijao: Feijao) {
        peso += feijao.peso
    }

    fun comer(arroz: Arroz) {
        peso += arroz.peso
    }
}

fun main() {
    val feijao = Feijao(0.3)
    val arroz = Arroz(0.3)

    var p1 = Pessoa(50.00)
    var p2 = Pessoa(60.00)

    p1.comer(arroz)
    p2.comer(feijao)

    println(
        "O pesoo de p1 e ${p1.peso}" +
                "\nO peso de p2 e ${p2.peso}"
    )
}