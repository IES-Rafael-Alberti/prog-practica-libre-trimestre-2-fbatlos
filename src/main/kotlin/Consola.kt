package org.practicatrim2

class Consola {
    /**
     * Función que solicita al usuario ingresar su nombre para el Escape Room La Cambiaformas.
     * Verifica que el nombre no esté vacío y que no consista solo en dígitos.
     * @return El nombre válido ingresado por el usuario.
     * @throws IllegalArgumentException Si el nombre está vacío o consiste solo en dígitos.
     */
    fun pedirNombre(): String {
        println("Dime tu nombre para el Escape Room : La cambiaformas")
        var nombre: String? = null
        do {
            try {
                nombre = readln()
                if (nombre.isEmpty() || nombre.all { it.isDigit() }) {
                    error(" ")
                }
            } catch (_: Exception) {
                println("El nombre no es valido")
                println("\nDame un nombre que sirva.")
                nombre = null
            }
        } while (nombre == null)
        return nombre
    }

    fun historiaInico(historia:Historia){
        println("La habitacion cambio de forma y la historia que te ha tocado se titula :\n                                ${historia.name}")
        println("************************************************************************************************************************")
        println(historia.desc["Inicio"])
    }

    fun historiaFinal(historia: Historia){
        println(historia.desc["Final"])
    }

    fun lugarDondeMiras(lugar:String){
        println("Estas mirando la $lugar.\n")
    }

    fun encontrarPista(pistacifrada:String){
        println("Oh , hay algo")
        val cantidadPuntos = 5
        val tiempoEsperaMs = 1000L
        for (i in 1..cantidadPuntos) {
            print(".")
            Thread.sleep(tiempoEsperaMs)
        }
        println("\nHas encontrado un hoja de papel.\nLa lees y pone : ${pistacifrada}\n")
        println("Sabes que es ?")
    }

    fun noHayPista(){
        println("No hay nada has perdido 2 min.")
    }

    fun noExiste(){
        println("No existe donde quieres ir.")
    }

    fun mensajePuerta(historia: Historia){
        val mensaje = if (historia.name == "Maldicion") {
            "La puerta solo permite una palabra espacio otra palabra sino nunca lo dará por buena.\nContraseña : "
        } else {
            "La puerta solo permite de tres caracteres en tres caracteres sino nunca lo dará por buena.\nContraseña : "
        }
        print(mensaje)
    }

    fun pedirContrasenia(): String {
        val posibleContraseña = readln().normalizar()
        return posibleContraseña
    }

    fun pedirLugarDondeIr():Int {
        var cambioConsegido = false
        var numero:String
        do {
            println("Donde quieres ir?")
            print("Opciones donde mirar :\n1º cajones.\n2º lampara.\n3º armario.\n4º señor.\n5º habitacion.\n6º puerta\n-> ")
            numero = readln()
            try {
                numero.toInt()
                cambioConsegido = true

            } catch (_: Exception) {
                println("El numero no es valido\n")
            }
        }while (!cambioConsegido)
        return numero.toInt()
    }

    fun abrePuerta(){
        println("La puesta se ha abierto.\n")
    }

    fun noSeAbrePuerta(){
        println("Hay algo mal pero no sabes que es...")
    }


    fun noMovimiento(){
        println("Ya estas ahí.")
    }
}

/*Porcentajes
* 10% trabajo en clse
* 20% test
* 30% practica clase
* 40% practica clase
* */