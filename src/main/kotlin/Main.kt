package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion

fun main() {
    val nombre = pedirNombre()
    val usuario1 = Usuario(nombre)
    EscapeRoom(usuario1).iniciarEscapeRoom()





}

fun pedirNombre(): String {
    println("Dime tu nombre para el Escape Room : La cambia formas")
    var nombre: String? = null
    do {
        try {
            nombre = readln()
            if (nombre.isEmpty() || nombre.all { it.isDigit() } ){
                error(" ")
            }
        }catch (_:Exception){
            println("El nombre no es valido")
            println("\nDame un nombre que sirva.")
            nombre = null
        }
    }while (nombre == null)
    return nombre
}