package classes

class pessoa1(var nome: String)

class pessoa2(val nome: String)

class pessoa3(nomeInicial: String){
    val nome: String = nomeInicial
}


fun main() {
    val p1 = pessoa1("João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = pessoa2("Jorge")

    val p3 = pessoa3("Carlos")

    println("${ p2.nome} e ${p3.nome} são legais!")
}