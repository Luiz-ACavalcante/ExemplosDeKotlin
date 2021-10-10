package classes

class pessoa {
    constructor(nome: String, sobrenome: String) {
        this.nome = nome
        this.sobrenome = sobrenome
    }

    var nome: String = ""
        get() = field
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }

    var sobrenome: String = ""
        get() = field
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Indefinido"
        }

}
    fun main() {
        val p1 = pessoa("Luiz", "Alberto")

        val p2 = pessoa("", "")


        println("A primeira pessoa cadastrada e ${p1.nome} ${p1.sobrenome} " +
                "\nA segunda pessoa cadastrada é ${p2.nome} ${p2.sobrenome}")
    }


