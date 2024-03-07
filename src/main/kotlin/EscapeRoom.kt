package org.practicatrim2

import kotlin.random.Random

class EscapeRoom(usuario: Usuario) {
    val inicio = Historia.values().toList()[Random.nextInt(0,3)]
    val contraseña = GestionContraseña(inicio)
    fun iniciarEscapeRoom(){
        //values().toList()[Random.nextInt(0,3)]
        println(contraseña)
        println(inicio.desc["Inicio"])

    }
}