package org.practicatrim2
import kotlin.concurrent.timer

fun main() {
    val nombre = pedirNombre()
    val usuario1 = Usuario(nombre)
    EscapeRoom(usuario1).iniciarEscapeRoom()
}
/**
 * Función que solicita al usuario ingresar su nombre para el Escape Room La Cambiaformas.
 * Verifica que el nombre no esté vacío y que no consista solo en dígitos.
 * @return El nombre válido ingresado por el usuario.
 * @throws IllegalArgumentException Si el nombre está vacío o consiste solo en dígitos.
 */
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