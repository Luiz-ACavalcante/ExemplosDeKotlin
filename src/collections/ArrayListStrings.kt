package collections

fun main() {
    val string = arrayListOf<String>("Carro", "Moto", "Barco", "Avião")
    val string2 = arrayListOf<String>("Helicoptero", "Trem")

    //string.add(arrayListOf("Jato").toString())

    for(item in string){
        println(item.toUpperCase())
    }

    println(string2.union(string).sorted())
}