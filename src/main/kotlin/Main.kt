package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion
import org.practicatrim2.Habitacion.textoABinario

fun main() {
    /*val nombre = pedirNombre()
    val usuario1 = Usuario(nombre)
    EscapeRoom(usuario1).iniciarEscapeRoom()*/
    val tema = Historia.Maldicion
    val contraseña = GenerarContraseñaMaldicion().procesar(tema)
    Imagen().mostrar(tema, contraseña.toString())
}

fun pedirNombre(): String {
    println("Dime tu nombre para el Escape Room : La cambiaformas")
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