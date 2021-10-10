package Treinar

import java.awt.*
import java.awt.EventQueue
import javax.swing.*


class janelaDeTeste(titulo: String) : JFrame() {
    init {
        criarUI(titulo)
    }

    private fun criarUI(titulo: String) {

        setTitle(titulo)

        val botaoFechar = JButton("Fechar")// cria um botão para fechar a aplicação.

        botaoFechar.addActionListener { System.exit(0) } // define o que o botão ira fazer

        criarLayout(botaoFechar)// conteniner para armazanar os componentes filhos

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE // define o que acontece com o botão fechar
        setSize(300, 200) // tamanho da tela
        setLocationRelativeTo(null) // local de inicialização do JFrame
    }

    private fun criarLayout(vararg arg: JComponent) {
        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        /*O painel de conteúdo de a JFrameé uma área onde os componentes filhos são colocados.
        Os filhos são organizados por componentes não visíveis especializados chamados
        gerenciadores de layout.
        BorderLayout é o gerenciador de layout padrão de um painel de conteúdo.
        Este gerenciador é muito simples e útil apenas em casos limitados.
        Usamos o GroupLayoutgerenciador que é mais poderoso e flexível.
         */

        gl.autoCreateContainerGaps = true
        /*O autoCreateContainerGapsatributo cria lacunas entre os componentes e as bordas do contêiner.
        Espaços ou lacunas são parte importante do design de cada aplicativo.
         */

        gl.setHorizontalGroup(
            gl.createSequentialGroup()
                .addComponent(arg[0])
        )

        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addComponent(arg[0])
        )
        /*GroupLayoutgerente define o layout para cada dimensão de forma independente.
        Em uma etapa, colocamos os componentes ao longo do eixo horizontal;
        na outra etapa, organizamos os componentes ao longo do eixo vertical.
        Em ambos os tipos de layouts, podemos organizar os componentes sequencialmente
        ou em paralelo.
         Em um layout horizontal, uma linha de componentes é chamada de grupo sequencial
         e uma coluna de componentes é chamada de grupo paralelo.
          Em um layout vertical, uma coluna de componentes é chamada de grupo sequencial
          e uma linha de componentes de grupo paralelo.*/

        pack()

    }
}

fun mostrarJanela() {
    val frame = janelaDeTeste("Simples")
    frame.isVisible = true
}


fun main() {
    EventQueue.invokeLater(::mostrarJanela)//O invokeLatermétodo coloca o aplicativo na Fila de Eventos Swing. Ele é usado para garantir que todas as atualizações da IU sejam seguras para simultaneidade.

}

