package OO.Polimorfismo

open class Comida(val peso: Double)
class Ovo(peso: Double) : Comida(peso)
class Feijao1(peso: Double) : Comida(peso)
class Arroz1(peso: Double) : Comida(peso)
class Pessoa2(var peso: Double) {
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

fun main() {
    val feijao = Feijao1(0.3)
    val arroz = Arroz1(0.3)
    val ovo = Ovo(0.2)

    var p1 = Pessoa2(50.00)
    var p2 = Pessoa2(60.00)

    p1.comer(arroz)
    p1.comer(ovo)
    p1.comer(feijao)
    p2.comer(feijao)

    println(
        "O peso de p1 e ${p1.peso}" +
                "\nO peso de p2 e ${p2.peso}"
    )
}
