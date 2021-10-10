package OO.Herança

interface Esportivo {
    var turbo: Boolean

    fun ligarTurbo(){
        turbo = true
    }
    fun desligarTurbo(){
        turbo = false
    }
}