package classePersonnage

import item.*
import personnage.*

class Voleur(
    nom: String,
    pointDeVie: Int,
    pointDeVieMax: Int,
    attaque: Int,
    defense: Int,
    endurance: Int,
    vitesse: Int,
    armePrincipale: Arme?,
    armurePrincipale: Armure?,

) : Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipale, armurePrincipale){

    fun volerItem(cible: Personnage){
        if (cible.inventaire.size > 0) {
            val indexAleatoire = (0..cible.inventaire.size).random()
            val itemVole = cible.inventaire.removeAt(indexAleatoire)

            println("L'action a été réalisée avec succès ! Vous avez volé $itemVole à l'ennemi.")

            this.inventaire.add(itemVole)

            if (itemVole == cible.armePrincipale) {
                cible.armePrincipale == null
            } else if (itemVole == armurePrincipale) {
                cible.armurePrincipale == null
            }
        } else {
            println("Aucun objet n'a été volé haha cheh ratio.")
        }
    }
}