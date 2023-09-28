package item
import jeu.TirageDes
import personnage.Personnage

class Arme constructor (var nom: String, var description: String,val qualite: Qualite,val typeArme: TypeArme, val tiragesDes: TirageDes) {
    fun calculerDegats(): Int {

        val tirage = TirageDes(this.typeArme.nombreDes, this.typeArme.valeurDeMax)

        // Utilisation de la méthode lance() pour obtenir le résultat du lancé
        var resultat = tirage.lance()

        val tirageCrit = TirageDes(this.typeArme.nombreDes, this.typeArme.activationCritique)

        if(tirageCrit.lance() <= this.typeArme.activationCritique){

            var critique = resultat * this.typeArme.multiplicateurCritique

            var degatsTotal = critique + this.qualite.bonusRarete

            return degatsTotal

        } else{
            val degatsTotal = resultat + this.qualite.bonusRarete
            return degatsTotal
        }
    }

    fun utiliser(personnage: Personnage){

    }

}