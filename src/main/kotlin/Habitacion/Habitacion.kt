package org.practicatrim2.Habitacion

/**
 *
 */
open class Habitacion {

    fun textoABinario(texto: String): String {
        return texto.map { char -> char.toInt().toString(2).padStart(8, '0') }.joinToString(" ")
    }
}