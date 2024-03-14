package org.practicatrim2.Habitacion

import org.practicatrim2.Consola
import org.practicatrim2.Historia
import kotlin.random.Random

class Habitacion2(tematica: Historia, contrasenia: String) :Habitacion(tematica, contrasenia) {
    override var solucionado = false
    override var lugar = "dormitorio"
    override fun Enigma() {
        ponerPista(Random.nextInt(1,5))
        do {
            Consola().lugarDondeMiras(lugar)
            lugar = MovimientoJugador(lugar)

        }while (!solucionado)
    }

    object Objeto {
        var pistas = mutableMapOf(
            "cama" to false,
            "mesilla" to false,
            "cuadro" to false,
            "gato" to false
        )
    }

    override fun MovimientoJugador(lugarDondeEstas: String): String {
        var teHasMovido = false
        var lugarDondeVas: Int
        do {
            Consola().mostrarLugares2()
            lugarDondeVas = Consola().pedirLugarDondeIr()
            when (lugarDondeVas) {
                1 -> {
                    if (comprobarLugar(lugarDondeEstas, "cama")) {
                        abrirObjeto("cama")
                        teHasMovido = true
                        return "cama"
                    }
                }

                2 -> {
                    if (comprobarLugar(lugarDondeEstas, "mesilla")) {
                        abrirObjeto("mesilla")
                        teHasMovido = true
                        return "mesilla"
                    }
                }

                3 -> {
                    if (comprobarLugar(lugarDondeEstas, "cuadro")) {
                        abrirObjeto("cuadro")
                        teHasMovido = true
                        return "cuadro"
                    }
                }

                4 -> {
                    if (comprobarLugar(lugarDondeEstas, "gato")) {
                        abrirObjeto("gato")
                        teHasMovido = true
                        return "gato"
                    }
                }

                5 -> {
                    if (comprobarLugar(lugarDondeEstas, "dormitorio")) {
                        teHasMovido = true
                        return "dormitorio"
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

    override fun abrirPuerta() {
        Consola().mensajePuerta2(tipoHistoria)
        val posibleContrasenia =Consola().pedirContrasenia()
        solucionado = comprobarSolucion(contrasenia, posibleContrasenia)
    }

    override fun comprobarSolucion(codigo: String, posibleSolucio: String): Boolean {
        val codigoNecesario = codigo.split(" ")
        val Solucion = posibleSolucio.split(" ").toMutableList()
        if ( codigoNecesario[0] == Solucion[0] && codigoNecesario[1] == Solucion[1] ){
            Consola().abrePuerta()
            return true
        }else {
            Consola().noSeAbrePuerta2()
            return false
        }
    }

    override fun ponerPista(lugar: Int) {
        when(lugar){
            1 -> {
                Objeto.pistas["cama"] = true}
            2 -> {
                Objeto.pistas["mesilla"] = true}
            3 -> {
                Objeto.pistas["cuadro"] = true}
            4 -> {
                Objeto.pistas["gato"] = true}
        }
    }

    override fun abrirObjeto(nombreObjeto: String) {
        if (Objeto.pistas[nombreObjeto] == true){
            Consola().encontrarPista2()
            obtenerAdivinanza(contrasenia)
            Objeto.pistas[nombreObjeto]= true
        }else{
            Consola().noHayPista()
        }
    }

    fun obtenerAdivinanza(contrasenia: String){
        val adivinanza = contrasenia.split(" ")[1]

        when(adivinanza){
            "Maxima" -> Consola().maldicionAdivinanaza1()
            "Oculus" -> Consola().maldicionAdivinanaza2()
            "SCI" -> Consola().laboratorioAdivinanza1()
            "XeY" -> Consola().laboratorioAdivinanza2()
            "852" -> Consola().naveAdivinanza()
            "855" -> Consola().naveAdivinanza2()
        }
    }

}