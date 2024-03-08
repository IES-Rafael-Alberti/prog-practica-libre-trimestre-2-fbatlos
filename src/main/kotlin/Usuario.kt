package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion
import org.practicatrim2.Habitacion.comprobarSolucionParte1
import org.practicatrim2.Habitacion.pedirLugarDondeIr

data class Usuario(val nombre:String)



fun comprobarLugar(lugarDondeEstas:String,lugarDondeVas: String):Boolean{
    if (lugarDondeEstas == lugarDondeVas){
        println("Ya estas ahí.")
        return false
    }else{
        return true
    }
}
