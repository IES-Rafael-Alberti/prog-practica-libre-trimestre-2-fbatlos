package org.practicatrim2

import org.practicatrim2.Habitacion.Habitacion


data class Usuario(val nombre:String)

fun comprobarLugar(lugarDondeEstas:String,lugarDondeVas: String):Boolean{
    if (lugarDondeEstas == lugarDondeVas && lugarDondeVas != "puerta"){
        println("Ya estas ahí.")
        return false
    }else{
        return true
    }
}
