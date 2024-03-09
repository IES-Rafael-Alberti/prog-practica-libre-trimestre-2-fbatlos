package org.practicatrim2

import org.practicatrim2.Habitacion.HabitacionLaboratorio
import org.practicatrim2.Habitacion.HabitacionMaldicion
import org.practicatrim2.Habitacion.HabitacionNave

class Gestion {
    fun Imagenes(tematica: Historia, contraseña: String): String {
        val direccion:String = Direccion(tematica,contraseña).toString()
        return direccion
    }

    fun Direccion(tematica: Historia,contraseña: String){
        val directorio = "C:\\Users\\Paco\\IdeaProjects\\prog-practica-libre-trimestre-2-fbatlos\\src\\main\\kotlin\\ImagenesHabitaciones/"
        val tipos = TematicaDibujo(tematica)
        val ImagenElegida = ImagenElegida(contraseña)

    }

    fun TematicaDibujo(tematica: Historia):List<String>{
        when (tematica.name) {
            "Maldicion" -> {return listOf("dibujoMaldicionKey1.png","dibujoMaldicionKey.png") }
            "Nave" -> {return listOf("dibujoNaveKey1.png","dibujoNaveKey2.png") }
            "Laboratorio" -> {return listOf("dibujoLaboratorioKey1.png","dibujoLaboratorioKey2.png")}
            else -> error(" ")
        }
        return listOf("")
    }

    fun ImagenElegida(contraseña: String){


    }
}