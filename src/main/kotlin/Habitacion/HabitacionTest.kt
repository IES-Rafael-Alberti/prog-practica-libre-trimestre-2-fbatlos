package org.practicatrim2.Habitacion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.practicatrim2.Historia

class HabitacionTest{

    @Test
    fun TestcomprobarTexto(){
        val texto = "hola"
        val numero = "1234"
        val comprobarTextodeTexto: Boolean = Habitacion(Historia.Nave,"Hola").comprobarTexto(texto)

        assertEquals(true,comprobarTextodeTexto)
        //assertEquals(false,comprobarTexto)
    }
}