package org.practicatrim2
/**
 * Clase que representa un usuario con un nombre.
 * @property nombre El nombre del usuario.
 */
data class Usuario(val nombre:String)
/**
 * Función que comprueba si el usuario ya se encuentra en el lugar al que se dirige.
 * @param lugarDondeEstas El lugar actual del usuario.
 * @param lugarDondeVas El lugar al que se dirige el usuario.
 * @return `true` si el usuario no está en el mismo lugar al que se dirige o si se dirige a la "puerta",
 *  y `false` si ya está en el lugar al que se dirige (y no es la "puerta").
 */
fun comprobarLugar(lugarDondeEstas:String,lugarDondeVas: String):Boolean{
    if (lugarDondeEstas == lugarDondeVas && lugarDondeVas != "puerta"){
        println("Ya estas ahí.")
        return false
    }else{
        return true
    }
}
