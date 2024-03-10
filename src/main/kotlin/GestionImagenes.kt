package org.practicatrim2

import org.practicatrim2.Habitacion.HabitacionLaboratorio
import org.practicatrim2.Habitacion.HabitacionMaldicion
import org.practicatrim2.Habitacion.HabitacionNave
import java.io.BufferedReader
import java.io.FileReader

class Gestion {
    fun Direccion(tematica: Historia,contraseña: String):String{
        val directorio = System.getProperty("user.dir")+"\\src\\main\\kotlin\\ImagenesHabitaciones/"
        val ImagenElegida = ImagenElegida(tematica,contraseña)
        return directorio + ImagenElegida
    }

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
                        imagen = "dibujoNaveKey1.png"
                    }else{
                        imagen = "dibujoNaveKey2.png"
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