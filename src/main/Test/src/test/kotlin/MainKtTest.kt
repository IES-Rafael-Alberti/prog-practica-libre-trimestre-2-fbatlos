import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.practicatrim2.normalizar

class MainKtTest {

    @Test
    fun normalizar() {
        val parametrosValidos = "pepe"
        val parametrosInvalidos = ""




        assertEquals("Pepe",parametrosValidos.normalizar())
    }
}