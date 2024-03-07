package org.practicatrim2.Habitacion

import org.practicatrim2.Historia
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,contraseña :String){
    val tipoHistio = tematica.name
    val pista = textoABinario(contraseña)
    val solcionado = false

    fun Enigma(){
        ponerPista(Random.nextInt(1,5))
        val solucion = readln()



    }

    object cajones{
        var pista = false

    }

    object lampara{
        var pista = false
    }

    object armario{
        var pista = false
    }

    object señor{
        var pista = false
    }


}
fun ponerPista(lugar:Int){
    when(lugar){
        1 -> {Habitacion.cajones.pista = true}
        2 -> {Habitacion.lampara.pista = true}
        3 -> {Habitacion.armario.pista = true}
        4 -> {Habitacion.señor.pista = true}
    }
}


fun textoABinario(texto: String): String {//Mirar como coger num y strings

    if(comprobarTexto(texto)){
        val textoEnigma1 = dividirTextoLetras(texto)
        return textoEnigma1.map { char -> char.toInt().toString(2).padStart(8, '0') }.joinToString(" ")

    }else{
        val textoEnigma1 = dividirTextoNumeros(texto)
        return Integer.toBinaryString((textoEnigma1[0]+textoEnigma1[1]).toInt())
    }
}

fun comprobarTexto(texto: String):Boolean{
    return !texto.all { it.isDigit() }
}

fun dividirTextoLetras(texto: String): String {
    val texto = texto.split(" ")
    val textoDeLosPrimeros = texto[0] + texto[1]
    return textoDeLosPrimeros
}
fun dividirTextoNumeros(texto: String):List<String>{
    val texto = texto.split(" ")
    val textoDeLosPrimeros = listOf(texto[0],texto[1])
    return textoDeLosPrimeros
}

    fun <T> comprobarSolucionParte1(codigo:T, posibleSolucio:T):Boolean{
        val codigoNecesario = codigo.toString().split(" ")
        val Solucion = posibleSolucio.toString().split(" ")
        if (codigoNecesario[0] == Solucion[0] && codigoNecesario[1] == Solucion[1] ){
            return true
        }else {return false}
    }

    fun <T> comprobarSolucionParte2(codigo:T, posibleSolucio:T):Boolean{
        val codigoNecesario = codigo.toString().split(" ")[2]
        val Solucion = posibleSolucio.toString()
        if (codigoNecesario == Solucion){
            return true
        }else{return  false}
    }
