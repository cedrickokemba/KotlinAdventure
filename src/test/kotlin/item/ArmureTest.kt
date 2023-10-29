package item

import cotteDeMaillesAdamantine
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

import cotteDeMaillesAdamantine

class ArmureTest {
    @Test
    fun calculeProtection() {
        val result = cotteDeMaillesAdamantine.calculeProtection()
        print(result)
        Assertions.assertEquals(6+1, result)

    }
}