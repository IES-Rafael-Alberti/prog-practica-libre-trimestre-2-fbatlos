package org.practicatrim2

import java.io.File
/**
 * Interfaz para la generación de contraseñas basadas en una temática específica.
 * @param Historia Tipo de dato que representa la temática de la contraseña.
 */
interface Contraseña<Historia>{
    /**
     * Procesa la temática dada y genera una contraseña.
     * @param tematica La temática sobre la cual se genera la contraseña.
     * @return La contraseña generada o null si no se puede obtener.
     */
    fun procesar(tematica:Historia):String?

}
/**
 * Implementación de la interfaz [Contraseña] para generar contraseñas relacionadas con la maldición.
 */
class GenerarContraseñaMaldicion:Contraseña<Historia>{
    override fun procesar(tematica: Historia): String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Maldicion.txt")
        return palabra
    }
}
/**
 * Implementación de la interfaz [Contraseña] para generar contraseñas relacionadas con el espacio.
 */
class GenerarContraseñaEspacio:Contraseña<Historia>{
    override fun procesar(tematica: Historia):String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Nave.txt")
        return palabra
    }
}
/**
 * Implementación de la interfaz [Contraseña] para generar contraseñas relacionadas con un laboratorio.
 */
class GenerarContraseñaLaboratorio:Contraseña<Historia>{
    override fun procesar(tematica: Historia):String? {
        var workingDirectory = System.getProperty("user.dir")
        workingDirectory +="\\src\\main\\kotlin\\ContraseñasTxt"
        val palabra = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/Laboratorio.txt")
        return palabra
    }
}
/**
 * Función que gestiona la generación de contraseñas en función de la temática proporcionada.
 * @param tematica La temática para la cual se generará la contraseña.
 * @return La contraseña generada o un mensaje predeterminado si la temática no coincide con ninguna categoría.
 */
fun GestionContraseña(tematica: Historia): String? {
    return when(tematica.name)
    {
        "Maldicion" -> {GenerarContraseñaMaldicion().procesar(tematica)}
        "Nave" -> {GenerarContraseñaEspacio().procesar(tematica)}
        "Laboratorio" -> {GenerarContraseñaLaboratorio().procesar(tematica)}
        else -> "Hola"
    }
}
/**
 * Función que obtiene una contraseña aleatoria de un archivo.
 * @param nombreArchivo La ruta del archivo que contiene las contraseñas.
 * @return Una contraseña aleatoria del archivo o null si el archivo está vacío.
 */
fun obtenerPalabraAleatoriaDeArchivo(nombreArchivo: String): String? {
    val palabras = File(nombreArchivo).useLines { it.toList() }
    if (palabras.isNotEmpty()) {
        return palabras.random()
    }
    return null
}