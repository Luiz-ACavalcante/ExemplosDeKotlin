package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var minhaCasa = Casa()
    minhaCasa.run {
        endereco = "Rua Francisco"
        num = 975
    }
}