package item

import hache
import org.junit.Test
import org.junit.jupiter.api.Assertions
import qualiteCommun

class ArmeTest {
    @Test
    fun calculerDegats() {
        val arme = Arme("","",qualiteCommun,hache)
        var result=arme.calculerDegats()
        println(result)

        Assertions.assertTrue(result >=1)
        Assertions.assertTrue(result <=16)
    }
}