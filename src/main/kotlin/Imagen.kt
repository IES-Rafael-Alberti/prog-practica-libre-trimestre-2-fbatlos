package org.practicatrim2
import java.awt.Graphics
import java.awt.Image
import java.awt.Toolkit
import java.awt.image.ImageObserver
import java.io.File
import javax.imageio.ImageIO
import javax.swing.JFrame
import javax.swing.JPanel

class ImagePanel(private val imagePath: String) : JPanel() {

    private val image: Image = ImageIO.read(File(imagePath))
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.drawImage(image, 0, 0, this)
    }
}

class Imagen(){
     fun mostrar( tematica:Historia, contraseña: String) {
         val dimensiones = gestionDeDiemnsiones(tematica)
         val imagePath = Gestion().Direccion(tematica, contraseña)
         val frame = JFrame("Imagen en Kotlin")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(dimensiones[0], dimensiones[1])
        val imagePanel = ImagePanel(imagePath)
        frame.contentPane.add(imagePanel)
        frame.isVisible = true
    }

    fun gestionDeDiemnsiones(tematica: Historia): List<Int> {
        if (tematica.name == "Maldicion"){
            return listOf(1600,1024)
        }else{
            return listOf(1024,1024)
        }
    }
}


