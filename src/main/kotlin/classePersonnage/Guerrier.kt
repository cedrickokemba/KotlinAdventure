package classePersonnage
import item.*
import personnage.*

class Guerrier(
    nom: String,
    pointDeVie: Int,
    pointDeVieMax: Int,
    attaque: Int,
    defense: Int,
    endurance: Int,
    vitesse: Int,
    armePrincipale: Arme?,
    armurePrincipale: Armure?,
    var armeSecondaire: Arme?
): Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipale, armurePrincipale ) {

    // Méthode pour afficher les armes dans l'inventaire
    fun afficherArmes() {
        println("Armes de ${this.nom} :")
        for (item in inventaire) {
            if (item is Arme) {
                println("- ${item.nom}")
            }
        }
    }

    fun attaquer(adversaire: Personnage) {
        var degats = 0

        if (armePrincipale != null) {
            degats += attaque + armePrincipale!!.calculerDegats()
        }

        if (armeSecondaire != null) {
            degats += attaque + armeSecondaire!!.calculerDegats()
        }

        // Soustraction de la défense de l'adversaire
        degats -= adversaire.calculeDefense()

        // Vérification si les dégâts sont positifs
        if (degats > 0) {
            adversaire.pointDeVie -= degats
            println("$nom attaque ${adversaire.nom} et inflige $degats points de dégâts.")
        } else {
            println("$nom attaque ${adversaire.nom} mais ne fait aucun dégât.")
        }
    }


    override fun equipeArme(armeEquipe: Arme) {
        if (armeEquipe in this.inventaire) {
            var armePrincipal = armeEquipe
            println("${this.nom} equipe ${armeEquipe.nom}")
        }
    }
}

