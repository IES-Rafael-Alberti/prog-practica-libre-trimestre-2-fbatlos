package org.practicatrim2.Habitacion

import org.practicatrim2.Consola
import org.practicatrim2.Historia
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,val contrasenia: String){
    val tipoHistoria = tematica
    val pistacifrada = textoABinario(contrasenia)
    open var solucionado = false
    open var lugar = "habitacion"
    open fun Enigma(){
        ponerPista(Random.nextInt(1,5))
        do {
            Consola().lugarDondeMiras(lugar)
            lugar = MovimientoJugador(lugar)

        }while (!solucionado)
    }

    object Objeto {
        var pistas = mutableMapOf(
            "cajones" to false,
            "lampara" to false,
            "armario" to false,
            "senior" to false
        )
    }

    open fun abrirObjeto(nombreObjeto:String){
        if (Objeto.pistas[nombreObjeto] == true){
            Consola().encontrarPista(pistacifrada)
            Objeto.pistas[nombreObjeto]= true
        }else{
            Consola().noHayPista()
        }
    }

    open fun MovimientoJugador(lugarDondeEstas:String): String{
        var teHasMovido = false
        var lugarDondeVas: Int
        do {
            Consola().mostrarLugares1()
            lugarDondeVas = Consola().pedirLugarDondeIr()
            when (lugarDondeVas) {
                1 -> {
                    if (comprobarLugar(lugarDondeEstas, "cajones")) {
                        abrirObjeto("cajones")
                        teHasMovido = true
                        return "cajones"
                    }
                }

                2 -> {
                    if (comprobarLugar(lugarDondeEstas, "lampara")) {
                        abrirObjeto("lampara")
                        teHasMovido = true
                        return "lampara"
                    }
                }

                3 -> {
                    if (comprobarLugar(lugarDondeEstas, "armario")) {
                        abrirObjeto("armario")
                        teHasMovido = true
                        return "armario"
                    }
                }

                4 -> {
                    if (comprobarLugar(lugarDondeEstas, "senior")) {
                        abrirObjeto("senior")
                        teHasMovido = true
                        return "senior"
                    }
                }

                5 -> {
                    if (comprobarLugar(lugarDondeEstas, "habitacion")) {
                        teHasMovido = true
                        return "habitacion"
                    }
                }

                6 -> {
                    if (comprobarLugar(lugarDondeEstas,"puerta")){
                        abrirPuerta()
                        teHasMovido = true
                        return "puerta"
                    }
                }
                else -> {
                    Consola().noExiste()
                    return lugarDondeEstas
                }
            }
        }while (teHasMovido == false)
        return ""
    }

    open fun abrirPuerta() {
        Consola().mensajePuerta1(tipoHistoria)
        val posibleContrasenia =Consola().pedirContrasenia()
        solucionado = comprobarSolucion(contrasenia, posibleContrasenia)
    }

    open fun ponerPista(lugar:Int){
        when(lugar){
            1 -> {Objeto.pistas["cajones"] = true}
            2 -> {Objeto.pistas["lampara"] = true}
            3 -> {Objeto.pistas["armario"] = true}
            4 -> {Objeto.pistas["senior"] = true}
        }
    }

    private fun textoABinario(texto: String): String {//Mirar como coger num y strings
        if(comprobarTexto(texto)){
            val textoEnigma1 = dividirTextoLetras(texto)
            return textoEnigma1.map { char -> char.toInt().toString(2).padStart(8, '0') }.joinToString(" ")
        }else{
            val textoEnigma1 = dividirTextoNumeros(texto)
            return Integer.toBinaryString((textoEnigma1[0]+textoEnigma1[1]).toInt())
        }
    }

    private fun comprobarTexto(texto: String):Boolean{
        return !texto.all { it.isDigit() }
    }

    private fun dividirTextoLetras(texto: String): String {
        val texto = texto.split(" ")
        val textoDeLosPrimeros = texto[0]
        return textoDeLosPrimeros
    }

    private fun dividirTextoNumeros(texto: String):List<String>{
        val texto = texto.split(" ")
        val textoDeLosPrimeros = listOf(texto[0])
        return textoDeLosPrimeros
    }

    open fun  comprobarSolucion(codigo:String, posibleSolucio:String):Boolean{
        val codigoNecesario = codigo.split(" ")
        val Solucion = posibleSolucio.split(" ")
        if (codigoNecesario[0] == Solucion[0]){
            Consola().abrePuerta()
            return true
        }else {
            Consola().noSeAbrePuerta()
            return false
        }
    }

    /**
     * Función que comprueba si el usuario ya se encuentra en el lugar al que se dirige.
     * @param lugarDondeEstas El lugar actual del usuario.
     * @param lugarDondeVas El lugar al que se dirige el usuario.
     * @return `true` si el usuario no está en el mismo lugar al que se dirige o si se dirige a la "puerta",
     *  y `false` si ya está en el lugar al que se dirige (y no es la "puerta").
     */
    open fun comprobarLugar(lugarDondeEstas:String,lugarDondeVas: String):Boolean{
        if (lugarDondeEstas == lugarDondeVas && lugarDondeVas != "puerta"){
            Consola().noMovimiento()
            return false
        }else{
            return true
        }
    }
}













