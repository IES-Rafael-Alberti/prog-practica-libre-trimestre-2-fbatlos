package org.practicatrim2.Habitacion

import org.practicatrim2.Historia
import org.practicatrim2.normalizar
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,val contraseña: String){
    val tipoHistio = tematica
    val pistacifrada = textoABinario(contraseña)
    var solucionado = false
    var lugar = "habitacion"
    open fun Enigma(){
        println(tipoHistio.desc["Inicio"])
        ponerPista(Random.nextInt(1,5))
        do {

            println("Estas mirando la $lugar.\n")
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
    fun abrirObjeto(nombreObjeto:String){
        if (Objeto.pistas[nombreObjeto] == true){
            println("Oh , hay algo")
            val cantidadPuntos = 5
            val tiempoEsperaMs = 1000L
            for (i in 1..cantidadPuntos) {
                print(".")
                Thread.sleep(tiempoEsperaMs)
            }
            println("\nHas encontrado un hoja de papel.\nLa lees y pone : ${pistacifrada}\n")
            println("Sabes que es ?")
            Objeto.pistas[nombreObjeto]= true
        }else{
            println("No hay nada has perdido 2 min.")
        }
    }
    open fun MovimientoJugador(lugarDondeEstas:String): String{
        var teHasMovido = false
        var lugarDondeVas: Int
        do {
            lugarDondeVas = pedirLugarDondeIr()
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
                    if (comprobarLugar(lugarDondeEstas, "señor")) {
                        abrirObjeto("señor")
                        teHasMovido = true
                        return "señor"
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
                    println("No existe donde quieres ir.")
                    return lugarDondeEstas
                }
            }
        }while (teHasMovido == false)
        return ""
    }

    private fun abrirPuerta() {
        val mensaje = if (tipoHistio.name == "Maldicion") {
            "La puerta solo permite una palabra espacio otra palabra sino nunca lo dará por buena.\nContraseña : "
        } else {
            "La puerta solo permite de tres caracteres en tres caracteres sino nunca lo dará por buena.\nContraseña : "
        }
        print(mensaje)
        val posibleContraseña = readln().normalizar()
        solucionado = comprobarSolucionParte1(contraseña, posibleContraseña)
    }

    open fun ponerPista(lugar:Int){
        when(lugar){
            1 -> {Objeto.pistas["cajones"] = true}
            2 -> {Objeto.pistas["lampara"] = true}
            3 -> {Objeto.pistas["armario"] = true}
            4 -> {Objeto.pistas["señor"] = true}
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

    open fun pedirLugarDondeIr():Int {
        var cambioConsegido = false
        var numero:String
        do {
            println("Donde quieres ir?")
            print("Opciones donde mirar :\n1º cajones.\n2º lampara.\n3º armario.\n4º señor.\n5º habitacion.\n6º puerta\n-> ")
            numero = readln()
            try {
                numero.toInt()
                cambioConsegido = true

            } catch (_: Exception) {
                println("El numero no es valido\n")
            }
        }while (!cambioConsegido)
        return numero.toInt()
    }

    open fun comprobarTexto(texto: String):Boolean{
        return !texto.all { it.isDigit() }
    }

    open fun dividirTextoLetras(texto: String): String {
        val texto = texto.split(" ")
        val textoDeLosPrimeros = texto[0] + texto[1]
        return textoDeLosPrimeros
    }

    open fun dividirTextoNumeros(texto: String):List<String>{
        val texto = texto.split(" ")
        val textoDeLosPrimeros = listOf(texto[0],texto[1])
        return textoDeLosPrimeros
    }

    open fun  comprobarSolucionParte1(codigo:String, posibleSolucio:String):Boolean{
        val codigoNecesario = codigo.split(" ")
        val Solucion = posibleSolucio.split(" ")
        if (codigoNecesario[0] == Solucion[0] && codigoNecesario[1] == Solucion[1] ){
            println("La puesta se ha abierto.\n")
            return true
        }else {
            println("Hay algo mal pero no sabes que es...")
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
            println("Ya estas ahí.")
            return false
        }else{
            return true
        }
    }
}













