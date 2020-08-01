import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.FlowLayout
import javax.swing.*


class App(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 200)
        setLocationRelativeTo(null)

        val panel = JPanel()
        panel.layout = BorderLayout()
        add(panel)

        val label = JLabel("Hello Snap World!")
        val button = JButton("Say Hello!")
        panel.add(label, BorderLayout.NORTH)
        panel.add(button, BorderLayout.SOUTH)

        button.addActionListener {
            JOptionPane.showMessageDialog(this, "Hello!")
        }
    }
}

private fun createAndShowGUI() {

    val frame = App("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}