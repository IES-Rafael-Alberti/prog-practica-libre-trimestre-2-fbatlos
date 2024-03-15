package org.practicatrim2.Habitacion


import org.practicatrim2.Consola
import org.practicatrim2.Historia
import org.practicatrim2.Imagen

class Habitacion3(val tematica: Historia, val contraseña: String) {
    var solucionado = false

    fun Enigma() {
        Consola().historiaIntermedia(tematica)
        val imagen = Imagen().mostrar(tematica,contraseña)
        do {
            solucionado = Consola().comprobarContrasenia(contraseña)
        }while (solucionado != true)
        Imagen().cerrar(imagen)
    }

}
