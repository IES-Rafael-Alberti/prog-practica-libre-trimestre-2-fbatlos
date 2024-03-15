import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/**
 * En el text comprobamos la funcionalidad del .normalizar() para ver si normaliza de forma aducuada y si tiene problema con String de numeros
 */

class MainKtTest {

    @Test
    fun normalizar() {
        val parametrosValidos = "pepe"
        val parametroSinEfecto = "122"

        assertEquals("Pepe",parametrosValidos.normalizar())
        assertEquals("122",parametroSinEfecto.normalizar())
    }
}