package org.practicatrim2
import java.awt.Frame
import java.awt.Graphics
import java.awt.Image
import java.awt.Toolkit
import java.awt.image.ImageObserver
import java.io.File
import javax.imageio.ImageIO
import javax.swing.JFrame
import javax.swing.JPanel
/**
 * Clase que representa un panel de imagen para mostrar en un JFrame.
 * @param imagePath La ruta de la imagen que se mostrará en el panel.
 */
class ImagePanel(private val imagePath: String) : JPanel() {

    private val image: Image = ImageIO.read(File(imagePath))
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.drawImage(image, 0, 0, this)
    }
}

class Imagen(){
    /**
     * Muestra una imagen en un JFrame.
     * @param tematica La temática de la imagen.
     * @param contraseña La contraseña asociada a la imagen.
     * @return El JFrame que contiene la imagen.
     */
     fun mostrar( tematica:Historia, contraseña: String): JFrame {
         val dimensiones = gestionDeDiemnsiones(tematica)
         val imagePath = Gestion().Direccion(tematica, contraseña)
         val frame = JFrame("Imagen en Kotlin")
         frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
         frame.setSize(dimensiones[0], dimensiones[1])
         val imagePanel = ImagePanel(imagePath)
         frame.contentPane.add(imagePanel)
         frame.isVisible = true
         return frame
    }
    /**
     * Obtiene las dimensiones adecuadas para la temática dada.
     * @param tematica La temática de la imagen.
     * @return Una lista que contiene las dimensiones [ancho, alto] de la imagen.
     */
    fun gestionDeDiemnsiones(tematica: Historia): List<Int> {
        if (tematica.name == "Maldicion"){
            return listOf(1610,1054)
        }else{
            return listOf(1034,1054)
        }
    }
    /**
     * Cierra el JFrame proporcionado.
     * @param frame El JFrame que se cerrará.
     */
    fun cerrar(frame: JFrame){
        frame.dispose()
    }
}


