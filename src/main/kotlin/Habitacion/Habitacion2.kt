package org.practicatrim2.Habitacion

import org.practicatrim2.Consola
import org.practicatrim2.Historia

class Habitacion2(tematica: Historia, contraseña: String) :Habitacion(tematica, contraseña) {
    override fun Enigma() {

    }

    override fun MovimientoJugador(lugarDondeEstas: String): String {
        var teHasMovido = false
        var lugarDondeVas: Int
        do {
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
                    Consola().noExiste()
                    return lugarDondeEstas
                }
            }
        }while (teHasMovido == false)
        return ""
    }









}