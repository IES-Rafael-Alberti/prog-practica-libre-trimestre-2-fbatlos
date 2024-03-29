package org.practicatrim2

import java.io.BufferedReader
import java.io.FileReader
/**
 * Clase que gestiona la obtención de direcciones de imágenes para habitaciones en función de la temática y contraseña.
 */
class Gestion {
    /**
     * Obtiene la dirección de la imagen correspondiente a la temática y contraseña proporcionadas.
     * @param tematica La temática de la habitación.
     * @param contraseña La contraseña utilizada para determinar la dirección de la imagen.
     * @return La dirección completa de la imagen correspondiente a la habitación.
     */
    fun Direccion(tematica: Historia,contraseña: String):String{
        val directorio = System.getProperty("user.dir")+"\\src\\main\\kotlin\\ImagenesHabitaciones/"
        val ImagenElegida = ImagenElegida(tematica,contraseña)
        return directorio + ImagenElegida
    }
    /**
     * Obtiene el nombre de la imagen correspondiente a la temática y contraseña proporcionadas.
     * @param tematica La temática de la habitación.
     * @param contraseña La contraseña utilizada para determinar el nombre de la imagen.
     * @return El nombre de la imagen correspondiente a la habitación.
     */
    fun ImagenElegida(tematica: Historia,contraseña: String):String{
        when (tematica.name) {
            "Maldicion" -> {
                val direccionTxt = System.getProperty("user.dir")+"\\src\\main\\kotlin\\ContraseñasTxt/Maldicion.txt"
                var imagen = " "
                try {
                    if (BufferedReader(FileReader(direccionTxt)).use{it.readLine() } == contraseña){
                        imagen = "dibujoMaldicionKey1.png"
                    }else{
                        imagen = "dibujoMaldicionKey2.png"
                    }
                }catch (_:Exception){
                    println("No se ha encontrado el Txt.")
                }
                return imagen
            }
            "Nave" -> {
                val direccionTxt = System.getProperty("user.dir")+"\\src\\main\\kotlin\\ContraseñasTxt/Nave.txt"
                var imagen = " "
                try {
                    if (BufferedReader(FileReader(direccionTxt)).use{it.readLine() } == contraseña){
                        imagen = "imagenNaveKey1.png"
                    }else{
                        imagen = "imagenNaveKey2.png"
                    }
                }catch (_:Exception){
                    println("No se ha encontrado el Txt.")
                }
                return imagen
            }
            "Laboratorio" -> {
                val direccionTxt = System.getProperty("user.dir")+"\\src\\main\\kotlin\\ContraseñasTxt/Laboratorio.txt"
                var imagen = " "
                try {
                    if (BufferedReader(FileReader(direccionTxt)).use{it.readLine() } == contraseña){
                        imagen = "imagenLaboratorioKey1.png"
                    }else{
                        imagen = "imagenLaboratorioKey2.png"
                    }
                }catch (_:Exception){
                    println("No se ha encontrado el Txt.")
                }
                return imagen
            }
            else -> {
                error(" ")
            }
        }
    }
}