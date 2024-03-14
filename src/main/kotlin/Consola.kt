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

    fun encontrarPista2(){
        println("Oh , hay algo")
        val cantidadPuntos = 5
        val tiempoEsperaMs = 1000L
        for (i in 1..cantidadPuntos) {
            print(".")
            Thread.sleep(tiempoEsperaMs)
        }
    }

    fun noHayPista(){
        println("No hay nada has perdido 2 min.")
    }

    fun noExiste(){
        println("No existe donde quieres ir.")
    }


    fun mensajePuerta2(historia: Historia){
        val mensaje = if (historia.name == "Maldicion") {
            "La puerta solo permite una palabra espacio otra palabra sino nunca lo dará por buena.\nContraseña : "
        } else {
            "La puerta solo permite de tres caracteres en tres caracteres sino nunca lo dará por buena.\nContraseña : "
        }
        print(mensaje)
    }

    fun mensajePuerta1(historia: Historia){
        val mensaje = if (historia.name == "Maldicion") {
            "La puerta solo permite una palabra sino nunca lo dará por buena.\nContraseña : "
        } else {
            "La puerta solo permite de tres sino nunca lo dará por buena.\nContraseña : "
        }
        print(mensaje)
    }

    fun pedirContrasenia(): String {
        var posibleContrasenia = ""
        var contraseniaValida = false
        do {
            try {

                posibleContrasenia = readln()
                contraseniaValida = true

            } catch (_: Exception) {
                println("Dato no valido.")
            }
        }while (!contraseniaValida)
        if (posibleContrasenia.isEmpty()){
            posibleContrasenia = "nada"
        }

        return posibleContrasenia
    }

    fun pedirLugarDondeIr():Int {
        var cambioConsegido = false
        var numero:String
        do {
            print("-> ")
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

   fun mostrarLugares1(){
       println("Donde quieres ir?")
       print("Opciones donde mirar :\n1º cajones.\n2º lampara.\n3º armario.\n4º señor.\n5º habitacion.\n6º puerta\n")
   }

    fun mostrarLugares2(){
        println("Donde quieres ir?")
        print("Opciones donde mirar :\n1º cama.\n2º mesilla.\n3º cuadro.\n4º gato.\n5º dormitorio.\n6º puerta\n")
    }

    fun abrePuerta(){
        println("\nLa puesta se ha abierto!!!!!!!!!!.\n"+
                "\nTe das cuenta que estas en otra habitacion")
    }

    fun noSeAbrePuerta(){
        println("Hay algo mal pero no sabes que es...")
    }

    fun noSeAbrePuerta2(){
        println("Tendre que usar alguna pista que ya haya usado ? .")
    }

    fun noMovimiento(){
        println("Ya estas ahí.")
    }

    fun historiaIntermedia(historia: Historia){
        println(historia.desc["Intermedio"])
        if (historia.name == "Maldicion"){
            println("Busca la contraseña y ponla en el orden correcto ya que el tiempo empieza arriba y termina bajando.(Deja un espacion entre palabra y palabra)")
        }else {
            println("Busca la contraseña y ponla en el orden correcto ya que el tiempo empieza arriba y termina bajando.(De tres en tres caracteres.)")
        }
    }

    fun comprobarContraseña(contraseña: String ): Boolean {
        print("Contraseña -> ")
        val posibleContraseña = readln().normalizar()
        if (contraseña == posibleContraseña){
            println("¡El candado se ha abierto!\n")
            return true
        }
        else{
            println("No es la solucion , dale una vuelta.")
            return false
        }
    }


    fun maldicionAdivinanaza1(){
        println("\nEn la cima de la montaña me hallarás,\n" +
                "Mi valor es incomparable, no hay igual.\n" +
                "En mí reside la grandeza sin final,\n" +
                "¿Quién soy? ¡Descúbrelo ya!\n")
    }

    fun maldicionAdivinanaza2(){
        println("\nEn un mundo de realidad virtual soy la puerta,\n" +
                "Donde la visión se transforma en una fiesta.\n" +
                "¿Quién soy? En la mente estoy, ni cerca ni lejos,\n" +
                "La ventana al otro lado, soy los ojos de espejos.")
    }

    fun laboratorioAdivinanza1(){
        println("\nEn el jabón y el champú, soy una estrella,\n" +
                "Con suavidad y limpieza, mi esencia destella.\n" +
                "Del coco vengo, con un toque especial.")
    }

    fun laboratorioAdivinanza2(){
        println("\nEn la CPU poderosa me encontrarás.\n"+
                "En el alfabeto estoy, pero no al principio,\n" +
                "Una vocal sin igual, soy un poquito distintivo.\n"+
                "De la tabla periódica soy una parte más.")
    }

    fun naveAdivinanza(){
        println("\nEn números estoy, pero no soy cualquiera,\n" +
                "En una secuencia especial, me encontrarás siempre primera.\n" +
                "Tres veces menor que 2.556, sin igual en mi lugar,\n" +
                "¿Qué número soy? ¡Adivina y podrás brillar!")
    }

    fun naveAdivinanza2(){
        println("\nEn la secuencia divina, me encuentro en el centro,\n" +
                "Números alineados, un mensaje sincero.\n" +
                "Con triple poder, en el cielo fijo estoy,\n" +
                "¿Quién soy yo? ¡El código del ángel, resplandezco con gozo!")
    }

}

/*Porcentajes
* 10% trabajo en clse
* 20% test
* 30% practica clase
* 40% practica clase
* */