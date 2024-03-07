package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion

data class Usuario(val nombre:String)

fun Movimiento(lugarDondeEstas:String,lugarDondeVas: Int): String {
    val teHasMovido = false
    do {
        when (lugarDondeVas) {
            1 -> {
                if (comprobarLugar(lugarDondeEstas, "cajones")) {
                    Habitacion.cajones
                    return "cajones"
                }
            }

            2 -> {
                if (comprobarLugar(lugarDondeEstas, "lampara")) {
                    Habitacion.lampara
                    return "lampara"
                }
            }

            3 -> {
                if (comprobarLugar(lugarDondeEstas, "armario")) {
                    Habitacion.armario
                    return "armario"
                }
            }

            4 -> {
                if (comprobarLugar(lugarDondeEstas, "señor")) {
                    Habitacion.señor
                    return "señor"
                }
            }

            5 -> {
                if (comprobarLugar(lugarDondeEstas, "habitacion")) {
                    return "habitacion"
                }
            }
        }
    }while (teHasMovido == false)
    return ""
}

fun comprobarLugar(lugarDondeEstas:String,lugarDondeVas: String):Boolean{
    if (lugarDondeEstas == lugarDondeVas){
        println("Ya estas ahí.")
        return false
    }else{
        return true
    }
}