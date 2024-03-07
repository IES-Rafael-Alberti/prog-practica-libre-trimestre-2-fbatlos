package org.practicatrim2.Habitacion

import org.practicatrim2.Historia
import org.practicatrim2.Movimiento
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,contraseña :String){
    val tipoHistio = tematica
    val pista = textoABinario(contraseña)
    val solcionado = false
    var lugar = "habitacion"
    fun Enigma(){
        println(tipoHistio.desc["Inicio"])
        ponerPista(Random.nextInt(1,5))
        lugar = Movimiento(lugar,1)



    }

    object cajones{
        var pista = false
        fun abrir(){
            if (pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : $pista\n")
                println("Sabes que es ?")
                pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object lampara{
        var pista = false
        fun abrir(){
            if (cajones.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${cajones.pista}\n")
                println("Sabes que es ?")
                cajones.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object armario{
        var pista = false
        fun abrir(){
            if (cajones.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${cajones.pista}\n")
                println("Sabes que es ?")
                cajones.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object señor{
        var pista = false
        fun abrir(){
            if (cajones.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${cajones.pista}\n")
                println("Sabes que es ?")
                cajones.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
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

    fun <T> comprobarSolucionParte1(codigo:T, posibleSolucio:T):Boolean{//No esta bien implementado pero puedes hacerlo estilo pila.
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
