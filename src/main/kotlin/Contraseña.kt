package org.practicatrim2

import java.io.File

interface Contraseña<Historia>{
    fun procesar(tematica:Historia):String?

}

class GenerarContraseñaMaldicion:Contraseña<Historia>{
    override fun procesar(tematica: Historia): String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Maldicion.txt")
        return palabra
    }
}

class GenerarContraseñaEspacio:Contraseña<Historia>{
    override fun procesar(tematica: Historia):String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Nave.txt")
        return palabra
    }
}

class GenerarContraseñaLaboratorio:Contraseña<Historia>{
    override fun procesar(tematica: Historia):String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Laboratorio.txt")
        return palabra
    }
}

fun GestionContraseña(tematica: Historia): String? {
    return when(tematica.name)
    {
        "Maldicion" -> {GenerarContraseñaMaldicion().procesar(tematica)}
        "Nave" -> {GenerarContraseñaEspacio().procesar(tematica)}
        "Laboratorio" -> {GenerarContraseñaLaboratorio().procesar(tematica)}
        else -> "Hola"
    }
}

fun obtenerPalabraAleatoriaDeArchivo(nombreArchivo: String): String? {
    val palabras = File(nombreArchivo).useLines { it.toList() }
    if (palabras.isNotEmpty()) {
        return palabras.random()
    }
    return null
}