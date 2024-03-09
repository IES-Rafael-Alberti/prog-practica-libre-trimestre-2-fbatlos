package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion
import org.practicatrim2.Habitacion.HabitacionLaboratorio
import org.practicatrim2.Habitacion.HabitacionMaldicion
import org.practicatrim2.Habitacion.HabitacionNave
import kotlin.random.Random

class EscapeRoom(usuario: Usuario) {
    val historia = Historia.values().toList()[Random.nextInt(0,3)]
    val contraseña = GestionContraseña(historia).toString()


    fun iniciarEscapeRoom(){
        println("La habitacion cambio de forma y la historia que te ha tocado se titula :\n                                ${historia.name}")
        println("************************************************************************************************************************")
        val PrimeraHabitacion = Habitacion(historia,contraseña)
        PrimeraHabitacion.Enigma()
        GestionHabitacion(historia,contraseña)

    }
}

fun GestionHabitacion(historia: Historia,contraseña: String){
    when (historia.name){
        "Maldicion" -> {HabitacionMaldicion(historia,contraseña)}
        "Nave" -> {HabitacionNave(historia,contraseña)}
        "Laboratorio" -> {HabitacionLaboratorio(historia,contraseña)}
    }
}