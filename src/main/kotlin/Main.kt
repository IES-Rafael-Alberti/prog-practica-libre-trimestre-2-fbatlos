package org.practicatrim2
import org.practicatrim2.Habitacion.Habitacion2
/**
* Coge la frase , la divide por los espacios y la capitaliza.
* @return Cada palabra de la frase capitalizada
*/
fun String.normalizar():String{
    val frase = this
    val fraseSinEspacio = frase.trim()
    val cadaPalabra= fraseSinEspacio.split(" ").filter { it.isNotEmpty() }
    val palabrasCapitalizadas = cadaPalabra.map { it.replaceFirstChar { it.uppercase() } }
    return palabrasCapitalizadas.joinToString(" ")
}

fun main() {
   val nombre = Consola().pedirNombre()
    val usuario1 = Usuario("pepe")
    EscapeRoom(usuario1).iniciarEscapeRoom()
}
