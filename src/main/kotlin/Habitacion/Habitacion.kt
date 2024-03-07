package org.practicatrim2.Habitacion

import org.practicatrim2.Historia
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,contraseña :String){
    val tipoHistio = tematica.name
    val solucionHabitacion = textoABinario(contraseña)
    val solcionado = false
    fun Enigma(){
        val lugarPista =listOf(cajones,lampara)[Random.nextInt(0,2)]

    }

    object cajones{
        val pista = false
    }

    object lampara{
        val pista = false
    }

    fun armario(){

    }

    fun señor(){

    }


}

fun textoABinario(texto: String): String {
    val textoDeLosPrimeros = texto.split(" ").removeLast()
    return textoDeLosPrimeros.map { char -> char.toInt().toString(2).padStart(8, '0') }.joinToString(" ")
}

interface Solucion<T>{
    fun comprobarSolucionParte1(codigo:T , posibleSolucio:T):Boolean{
        val codigoNecesario = codigo.toString().split(" ")
        val Solucion = posibleSolucio.toString().split(" ")
        if (codigoNecesario[0] == Solucion[0] && codigoNecesario[1] == Solucion[1] ){
            return true
        }else {return false}
    }

    fun comprobarSolucionParte2(codigo:T , posibleSolucio:T):Boolean{
        val codigoNecesario = codigo.toString().split(" ")[2]
        val Solucion = posibleSolucio.toString()
        if (codigoNecesario == Solucion){
            return true
        }else{return  false}
    }
}