package item

import jeu.TirageDes
import personnage.Personnage

class Bombe ( nom: String, var nbDe: Int, var maxDe: Int, description: String):Item(nom,description) {

    override fun utiliser(cible: Personnage) {
        val tirage = TirageDes(nbDe, maxDe)
        val degats = tirage.lance()

        val protectionCible = cible.calculeDefense()
        val degatsFinaux = maxOf(degats - protectionCible, 1)

        cible.pointDeVie -= degatsFinaux

        println("La cible a pris $degatsFinaux dégâts.")
    }

}

