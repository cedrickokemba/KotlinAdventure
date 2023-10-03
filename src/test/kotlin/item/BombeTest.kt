package item

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import bombeFlash
import personnage.Personnage

class BombeTest {

    @Test

    fun utiliserBombe() {
        val gobelin = Personnage(
        "gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        endurance = 6,
        vitesse = 11)
        var result=bombeFlash.utiliser(gobelin)

        println(result)
        var dgt = gobelin.pointDeVie - 1
       Assertions.assertTrue(gobelin.pointDeVie<20)
    }
}