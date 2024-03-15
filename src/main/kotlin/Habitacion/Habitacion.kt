package org.practicatrim2.Habitacion

import org.practicatrim2.Consola
import org.practicatrim2.Historia
import kotlin.random.Random

/**
 * Clase que representa una habitación en un juego de enigmas.
 *
 * @property tematica La temática de la historia asociada a la habitación.
 * @property contrasenia La contraseña requerida para resolver el enigma de la habitación.
 * @property tipoHistoria El tipo de historia asociada a la habitación.
 * @property pistacifrada La contraseña cifrada utilizada como pista para resolver el enigma.
 * @property solucionado Indica si el enigma de la habitación ha sido resuelto o no.
 * @property lugar El lugar actual en la habitación donde se encuentra el jugador.
 */
open class Habitacion(tematica:Historia,val contrasenia: String){
    val tipoHistoria = tematica
    val pistacifrada = textoABinario(contrasenia)
    open var solucionado = false
    open var lugar = "habitacion"
    /**
     * Método que simula resolver el enigma de la habitación.
     */
    open fun Enigma(){
        ponerPista(Random.nextInt(1,5))
        do {
            Consola().lugarDondeMiras(lugar)
            lugar = MovimientoJugador(lugar)

        }while (!solucionado)
    }
    /**
     * Objeto que contiene las pistas de la habitación.
     */
    object Objeto {
        var pistas = mutableMapOf(
            "cajones" to false,
            "lampara" to false,
            "armario" to false,
            "senior" to false
        )
    }
    /**
     * Método que abre un objeto en la habitación para obtener una pista.
     * @param nombreObjeto El nombre del objeto a abrir.
     */
    open fun abrirObjeto(nombreObjeto:String){
        if (Objeto.pistas[nombreObjeto] == true){
            Consola().encontrarPista(pistacifrada)
            Objeto.pistas[nombreObjeto]= true
        }else{
            Consola().noHayPista()
        }
    }
    /**
     * Método que permite al jugador moverse dentro de la habitación.
     * @param lugarDondeEstas El lugar actual donde se encuentra el jugador.
     * @return El nuevo lugar donde se encuentra el jugador.
     */
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
    /**
     * Abre la puerta de la habitación y verifica si la contraseña proporcionada es correcta para resolver el enigma.
     * @see comprobarSolucion
     */
    open fun abrirPuerta() {
        Consola().mensajePuerta1(tipoHistoria)
        val posibleContrasenia =Consola().pedirContrasenia()
        solucionado = comprobarSolucion(contrasenia, posibleContrasenia)
    }
    /**
     * Pone una pista en un objeto específico de la habitación.
     * @param lugar El índice del objeto en el que se colocará la pista.
     */
    open fun ponerPista(lugar:Int){
        when(lugar){
            1 -> {Objeto.pistas["cajones"] = true}
            2 -> {Objeto.pistas["lampara"] = true}
            3 -> {Objeto.pistas["armario"] = true}
            4 -> {Objeto.pistas["senior"] = true}
        }
    }
    /**
     * Convierte un texto en una representación binaria.
     * @param texto El texto que se convertirá en binario.
     * @return La representación binaria del texto.
     */
    private fun textoABinario(texto: String): String {//Mirar como coger num y strings
        if(comprobarTexto(texto)){
            val textoEnigma1 = dividirTextoLetras(texto)
            return textoEnigma1.map { char -> char.toInt().toString(2).padStart(8, '0') }.joinToString(" ")
        }else{
            val textoEnigma1 = dividirTextoNumeros(texto)
            return Integer.toBinaryString((textoEnigma1[0]+textoEnigma1[1]).toInt())
        }
    }
    /**
     * Verifica si un texto contiene caracteres no numéricos.
     * @param texto El texto que se verificará.
     * @return true si el texto contiene caracteres no numéricos, de lo contrario false.
     */
    private fun comprobarTexto(texto: String):Boolean{
        return !texto.all { it.isDigit() }
    }
    /**
     * Divide un texto en palabras y devuelve la primera palabra.
     * @param texto El texto que se dividirá.
     * @return La primera palabra del texto.
     */
    private fun dividirTextoLetras(texto: String): String {
        val texto = texto.split(" ")
        val textoDeLosPrimeros = texto[0]
        return textoDeLosPrimeros
    }
    /**
     * Divide un texto en palabras y devuelve una lista que contiene la primera palabra.
     * @param texto El texto que se dividirá.
     * @return Una lista que contiene la primera palabra del texto.
     */
    private fun dividirTextoNumeros(texto: String):List<String>{
        val texto = texto.split(" ")
        val textoDeLosPrimeros = listOf(texto[0])
        return textoDeLosPrimeros
    }
    /**
     * Comprueba si la solución proporcionada es correcta comparándola con la contraseña del enigma.
     * @param codigo La contraseña del enigma.
     * @param posibleSolucio La solución proporcionada por el jugador.
     * @return true si la solución es correcta, de lo contrario false.
     */
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













