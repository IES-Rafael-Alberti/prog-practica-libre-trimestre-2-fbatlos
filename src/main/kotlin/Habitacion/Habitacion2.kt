package org.practicatrim2.Habitacion


import org.practicatrim2.Historia
import org.practicatrim2.Imagen

class Habitacion2(val tematica: Historia, contraseña: String): Habitacion(tematica,contraseña) {
    override var solucionado = false
    override fun Enigma() {
        println(tematica.desc["Intermedio"])
        if (tematica.name == "Maldicion"){
            println("Busca la contraseña y ponla en el orden correcto ya que el tiempo empieza arriba y termina bajando.(Deja un espacion entre palabra y palabra)")
        }else {
            println("Busca la contraseña y ponla en el orden correcto ya que el tiempo empieza arriba y termina bajando.(De tres en tres caracteres.)")
        }
        val imagen = Imagen().mostrar(tematica,contraseña)
        do {
            print("Contraseña -> ")
            val posibleContraseña = readln().normalizar()
            comprobarContraseña(contraseña,posibleContraseña)
        }while (solucionado != true)
        Imagen().cerrar(imagen)
    }

    fun comprobarContraseña(contraseña: String , posibleContraseña:String){
        if (contraseña == posibleContraseña){
            solucionado = true
            println("¡El candado se ha abierto!\n")
        }
        else{
            println("No es la solucion , dale una vuelta.")
        }
    }


}
