package fundamentos

fun main() {
    val a: Int = 33.dec()
    val b: String = a.toString()

    println("Int: $a")

    println("Primeiro char da String b é: ${b.first()}")
    println("Segundo char da String b é: ${b.substring(1)}") // traz o segundo caracter da String
}