package collections

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf<Any>(3, "a", "texto", true, 3.14)

//    conjunto.get(1) - essa função não é permitida por ser um sete não ter indice definido
    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove('a').print()
    conjunto.remove("a").print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3)// somente leitura
    //nums.add(4)

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // não muda o conjunto
    conjunto.retainAll(nums)// muda os valores do conjuntos
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print() // varifica se esta vazio
}