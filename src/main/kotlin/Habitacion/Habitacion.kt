package org.practicatrim2.Habitacion

import org.practicatrim2.Historia
import org.practicatrim2.comprobarLugar
import kotlin.random.Random

/**
 *
 */
open class Habitacion(tematica:Historia,val contraseña: String){
    val tipoHistio = tematica
    open val pistacifrada = textoABinario(contraseña)
    open var solucionado = false
    var lugar = "habitacion"
    open fun Enigma(){
        println(tipoHistio.desc["Inicio"])
        ponerPista(Random.nextInt(1,5))
        do {

            println("Estas mirando la $lugar.\n")
            lugar = MovimientoJugador(lugar)

        }while (!solucionado)
    }

    object cajones{
        var pista = false
        fun abrir(objeto:Habitacion){
            if (pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${objeto.pistacifrada}\n")
                println("Sabes que es ?")
                pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object lampara{
        var pista = false
        fun abrir(objeto:Habitacion){
            if (lampara.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${objeto.pistacifrada}\n")
                println("Sabes que es ?")
                lampara.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object armario{
        var pista = false
        fun abrir(objeto:Habitacion){
            if (armario.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("Has encontrado un hoja de papel.\nLa lees y pone : ${objeto.pistacifrada}\n")
                println("Sabes que es ?")
                armario.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    object señor{
        var pista = false
        fun abrir(objeto:Habitacion){
            if (señor.pista){
                println("Oh , hay algo")
                val cantidadPuntos = 5
                val tiempoEsperaMs = 1000L
                for (i in 1..cantidadPuntos) {
                    print(".")
                    Thread.sleep(tiempoEsperaMs)
                }
                println("\nHas encontrado un hoja de papel.\nLa lees y pone : ${objeto.pistacifrada}\n")
                println("Sabes que es ?")
                señor.pista = false
            }else{
                println("No hay nada has perdido 2 min.")
            }
        }
    }

    fun MovimientoJugador(lugarDondeEstas:String): String {
        var teHasMovido = false
        var lugarDondeVas: Int
        do {
            lugarDondeVas = pedirLugarDondeIr()
            when (lugarDondeVas) {
                1 -> {
                    if (comprobarLugar(lugarDondeEstas, "cajones")) {
                        Habitacion.cajones.abrir(this)
                        teHasMovido = true
                        return "cajones"
                    }
                }

                2 -> {
                    if (comprobarLugar(lugarDondeEstas, "lampara")) {
                        Habitacion.lampara.abrir(this)
                        teHasMovido = true
                        return "lampara"
                    }
                }

                3 -> {
                    if (comprobarLugar(lugarDondeEstas, "armario")) {
                        Habitacion.armario.abrir(this)
                        teHasMovido = true
                        return "armario"
                    }
                }

                4 -> {
                    if (comprobarLugar(lugarDondeEstas, "señor")) {
                        Habitacion.señor.abrir(this)
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
                        if (tipoHistio.name == "Maldicion"){
                            print("La puerta solo permite una palabra espacio otra palabra sino nunca lo dará por buena.\nContraseña : ")
                        }else {
                            print("La puerta solo permite de tres caracteres en tres caracteres sino nunca lo dará por buena.\nContraseña : ")
                        }
                        val posibleContraseña = readln().normalizar()
                        solucionado = comprobarSolucionParte1(contraseña,posibleContraseña)
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

    fun pedirLugarDondeIr():Int {
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

    fun  comprobarSolucionParte1(codigo:String, posibleSolucio:String):Boolean{
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

    fun String.normalizar():String{
        val frase = this
        val fraseSinEspacio = frase.trim()
        val cadaPalabra= fraseSinEspacio.split(" ").filter { it.isNotEmpty() }
        val palabrasCapitalizadas = cadaPalabra.map { it.replaceFirstChar { it.uppercase() } }
        return palabrasCapitalizadas.joinToString(" ")
    }
}













