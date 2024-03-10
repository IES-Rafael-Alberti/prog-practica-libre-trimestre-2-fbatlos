package org.practicatrim2

import org.practicatrim2.Habitacion.*
import kotlin.random.Random

class EscapeRoom(usuario: Usuario) {
    val historia = Historia.values().toList()[Random.nextInt(0,3)]
    val contraseña = GestionContraseña(historia).toString()


    fun iniciarEscapeRoom(){
        println("La habitacion cambio de forma y la historia que te ha tocado se titula :\n                                ${historia.name}")
        println("************************************************************************************************************************")
        Habitacion(historia,contraseña).Enigma()
        Habitacion2(historia,contraseña).Enigma()
        println(historia.desc["Final"])
    }
}

