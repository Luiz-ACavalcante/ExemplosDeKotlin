package Treinar

import java.awt.Color
import java.awt.Dimension
import java.awt.EventQueue
import javax.swing.GroupLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingConstants.LEADING

class coresPadroesKotlin(titulo: String) : JFrame() {
    init {
        criarUI(titulo)
    }

    private fun criarUI(titulo: String) {

        setTitle(titulo)

        val colecaoCores = arrayOf<Color>(
            Color.BLACK,
            Color.black,
            Color.WHITE,
            Color.white,
            Color.BLUE,
            Color.blue,
            Color.CYAN,
            Color.cyan,
            Color.GRAY,
            Color.gray,
            Color.LIGHT_GRAY,
            Color.lightGray,
            Color.MAGENTA,
            Color.magenta,
            Color.ORANGE,
            Color.orange,
            Color.PINK,
            Color.pink,
            Color.YELLOW,
            Color.yellow,
            Color.RED,
            Color.red,
            Color.GREEN,
            Color.green,
            Color.DARK_GRAY,
            Color.darkGray,

            )

        val rotulos = colecaoCores.map {
            JLabel(
                "cor ${colecaoCores[0]}" /* coloca um texto dentro da label*/,
                null, LEADING
            ).apply {
                minimumSize = Dimension(60, 60) //Define o tamanha da label
                background = it //Define a cor de fundo da label
                isOpaque = true
            }
        }

        criarLayout(rotulos)

        setTitle(title)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setLocationRelativeTo(null)
    }

    private fun criarLayout(rotulos: List<JLabel>) {
        val gl = GroupLayout(contentPane)
        contentPane.layout = gl

        gl.autoCreateContainerGaps = true //Pesquisar
        gl.autoCreateGaps = true // Pesquisar

        gl.setHorizontalGroup(
            gl.createParallelGroup()
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(rotulos[0])
                        .addComponent(rotulos[1])
                        .addComponent(rotulos[2])
                        .addComponent(rotulos[3])
                        .addComponent(rotulos[4])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(rotulos[5])
                        .addComponent(rotulos[6])
                        .addComponent(rotulos[7])
                        .addComponent(rotulos[8])
                        .addComponent(rotulos[9])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(rotulos[10])
                        .addComponent(rotulos[11])
                        .addComponent(rotulos[12])
                        .addComponent(rotulos[13])
                        .addComponent(rotulos[14])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(rotulos[15])
                        .addComponent(rotulos[16])
                        .addComponent(rotulos[17])
                        .addComponent(rotulos[18])
                        .addComponent(rotulos[19])
                )
                .addGroup(
                    gl.createSequentialGroup()
                        .addComponent(rotulos[20])
                        .addComponent(rotulos[21])
                        .addComponent(rotulos[22])
                        .addComponent(rotulos[23])
                        .addComponent(rotulos[24])
                )
        )
        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(rotulos[0])
                        .addComponent(rotulos[1])
                        .addComponent(rotulos[2])
                        .addComponent(rotulos[3])
                        .addComponent(rotulos[4])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(rotulos[5])
                        .addComponent(rotulos[6])
                        .addComponent(rotulos[7])
                        .addComponent(rotulos[8])
                        .addComponent(rotulos[9])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(rotulos[10])
                        .addComponent(rotulos[11])
                        .addComponent(rotulos[12])
                        .addComponent(rotulos[13])
                        .addComponent(rotulos[14])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(rotulos[15])
                        .addComponent(rotulos[16])
                        .addComponent(rotulos[17])
                        .addComponent(rotulos[18])
                        .addComponent(rotulos[19])
                )
                .addGroup(
                    gl.createParallelGroup()
                        .addComponent(rotulos[20])
                        .addComponent(rotulos[21])
                        .addComponent(rotulos[22])
                        .addComponent(rotulos[23])
                        .addComponent(rotulos[24])
                )
        )
        pack()
    }
}

private fun criarJanela() {

    val frame = coresPadroesKotlin("Cores Padrão em Kotlin")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::criarJanela)
}