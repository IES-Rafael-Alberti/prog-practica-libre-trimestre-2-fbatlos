package org.practicatrim2
import java.awt.Graphics
import java.awt.Image
import java.awt.Toolkit
import java.awt.image.ImageObserver
import java.io.File
import javax.imageio.ImageIO
import javax.swing.JFrame
import javax.swing.JPanel
interface Imagen {
    fun mostrar()
}

class ImagePanel(private val imagePath: String) : JPanel() {

    private val image: Image = ImageIO.read(File(imagePath))
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.drawImage(image, 0, 0, this)
    }
}



class imagenMaldicion:Imagen{
    override fun mostrar() {
        val imagePath = "C:\\Users\\Paco\\IdeaProjects\\prog-practica-libre-trimestre-2-fbatlos\\src\\main\\kotlin\\ImagenesHabitaciones/dibujoMaldicion.png"
        val frame = JFrame("Imagen en Kotlin")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 600)
        val imagePanel = ImagePanel(imagePath)
        frame.contentPane.add(imagePanel)
        frame.isVisible = true
    }
}

class imagenNave:Imagen{
    override fun mostrar() {
        val imagePath = "C:\\Users\\Paco\\IdeaProjects\\prog-practica-libre-trimestre-2-fbatlos\\src\\main\\kotlin\\ImagenesHabitaciones/dibujoNave.png"
        val frame = JFrame("Imagen en Kotlin")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 600)
        val imagePanel = ImagePanel(imagePath)
        frame.contentPane.add(imagePanel)
        frame.isVisible = true
    }
}

class imagenLaboratorio:Imagen{
    override fun mostrar() {
        val imagePath = "C:\\Users\\Paco\\IdeaProjects\\prog-practica-libre-trimestre-2-fbatlos\\src\\main\\kotlin\\ImagenesHabitaciones/dibujoLaboratorio.png"
        val frame = JFrame("Imagen en Kotlin")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 600)
        val imagePanel = ImagePanel(imagePath)
        frame.contentPane.add(imagePanel)
        frame.isVisible = true
    }
}

