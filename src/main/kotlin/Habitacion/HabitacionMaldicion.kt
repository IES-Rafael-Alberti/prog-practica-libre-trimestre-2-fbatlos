package org.practicatrim2.Habitacion


import org.practicatrim2.Historia

class HabitacionMaldicion(val tematica: Historia, contraseña: String): Habitacion(tematica,contraseña) {
    override fun Enigma() {
        println(tematica.desc["Intermedio"])


    }
}
