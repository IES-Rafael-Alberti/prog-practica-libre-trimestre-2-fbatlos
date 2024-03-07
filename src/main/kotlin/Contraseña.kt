package org.practicatrim2

interface Contraseña<Historia>{
    fun procesar(tematica:Historia)

}

class GenerarContraseñaMaldicion:Contraseña<Historia>{
    override fun procesar(tematica: Historia) {

    }
}

class GenerarContraseñaEspacio:Contraseña<Historia>{
    override fun procesar(tematica: Historia) {

    }
}

class GenerarContraseñaLaboratorio:Contraseña<Historia>{
    override fun procesar(tematica: Historia) {

    }
}

class GestionContraseña:Contraseña<Historia>{
    override fun procesar(tematica: Historia) {

    }
}

