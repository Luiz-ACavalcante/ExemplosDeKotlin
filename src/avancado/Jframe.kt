package avancado

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel


class janelaClasseJframe : JFrame() { // Instancia de uma janela como classe
    var painel = paineltxt()

    init {
        isVisible = true // define se a janela e visivel ou não
        setSize(600, 500) // define o tamanho que a janela terá
        title = "Teste de Painel e Comandos" //define o titulo da janela
        add(painel.botao)


    }
}

class paineltxt : JPanel() {
    var botao = JButton("Fechar")



    init {
        isVisible = true
        setSize(30, 20)

    }

}

fun main() {
    janelaClasseJframe() // Chamada de uma classe
}