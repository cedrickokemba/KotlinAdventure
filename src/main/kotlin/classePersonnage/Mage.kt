package classePersonnage

import item.*
import personnage.*

class Mage(
    nom: String,
    pointDeVie: Int,
    pointDeVieMax: Int,
    attaque: Int,
    defense: Int,
    endurance: Int,
    vitesse: Int,
    armePrincipale: Arme?,
    armurePrincipale: Armure?
) : Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipale, armurePrincipale ) {

    fun afficheGrimoire() {
        println("Sorts de ${this.nom} :")
        for (sort in grimoire) {
            if (sort is Sort) {
                println("- ${sort.nom}")
            }
        }
    }




    fun chosirEtLancerSort(ennemi:Personnage) {
        if(grimoire.isEmpty()){
            print("Le grimoire est vide. Vous ne pouvez pas lancer de sort")
        } else{
            println(this.afficheGrimoire())
            println("Choix de sort : ")

            var indexSort = readln().toInt()
            if(this.grimoire.size<=indexSort)
            {


            var sort = this.grimoire[indexSort]

                var personnage = this
                var adversaire = ennemi

                println("Selectionnez votre cible :")
                println(" [0] => Personnage, [1] Ennemi")
                var cible = readln().toInt()
                if(cible == 0 || cible ==1){
                    if(cible == 0 ){
                    sort.effet(personnage,personnage)
                } else if(cible == 1){
                        sort.effet(personnage,adversaire)
                    }                }
            } else {
                println("Choix de sort invalide")
            }
        }
    }
}