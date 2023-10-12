package personnage
import classePersonnage.Sort
import item.*

open class Personnage(
    val nom: String,
    var pointDeVie: Int,
    val pointDeVieMax: Int,
    var attaque: Int,
    var defense: Int,
    var endurance: Int,
    var vitesse: Int,
    var armePrincipale: Arme?,
    var armurePrincipale: Armure?,
    var inventaire: MutableList<Item> = mutableListOf(),
    var grimoire: MutableList<Sort> = mutableListOf()
) {

    fun avoirPotion(): Boolean {
        for (item in this.inventaire) {
            if (item is Potion) {
                return true
            }
        }
        return false
    }

    fun avoirBombe(): Boolean {
        for (item in this.inventaire) {
            if (item is Bombe) {
                return true
            }
        }
        return false
    }

    fun boirePotion() {
        if (avoirPotion() == true) {
            var premierePotion = -1
            for (i in 0..this.inventaire.lastIndex) {
                if (this.inventaire[i] is Potion) {
                    val potion: Potion = this.inventaire[i] as Potion
                    premierePotion = potion.soin

                    this.inventaire.remove(potion)
                    break
                }
            }

            pointDeVie += premierePotion
            if (pointDeVie > pointDeVieMax) {
                this.pointDeVie = pointDeVieMax
            }

            println("Vous êtes maintenant à $pointDeVie grâce à l'usage de la potion.")

        }
    }

    fun calculeDefense(): Int {
        //TODO Mission 4.2
        var result = this.defense / 2;
        if (this.armurePrincipale != null) {
            result = result + this.armurePrincipale!!.calculeProtection()
        }
        return result;
    }

    // Méthode pour attaquer un adversaire
    fun attaque(adversaire: Personnage) {
        //TODO Mission 4.1
        var degats = this.attaque / 2

        if (armePrincipale != null) {
            degats += armePrincipale!!.calculerDegats()
        }

        degats-= adversaire.calculeDefense()
        if(degats<=1){
            degats=1
        }

        adversaire.pointDeVie -= degats
        println("$nom attaque ${adversaire.nom} avec une attaque de base et inflige $degats points de dégâts.")
    }

    fun afficheInventaire(){
        println("inventaire de ${this.nom}")
        for (i in 0..this.inventaire.lastIndex) {

            println(this.inventaire[i])
        }
    }

    fun loot(cible: Personnage){
        if (cible.pointDeVie <= 0){
            cible.armePrincipale = null
            cible.armurePrincipale = null
            this.inventaire.addAll(cible.inventaire)

            cible.inventaire = mutableListOf()
        }
    }


    override fun toString(): String {
        return "$nom (PV: $pointDeVie/$pointDeVieMax, Attaque: $attaque, Défense: $defense, Endurance: $endurance, Vitesse: $vitesse)"
    }

    open fun equipeArme(armeEquipe: Arme) {
        if (armeEquipe in this.inventaire) {
            var armePrincipal = armeEquipe
            println("${this.nom} equipe ${armeEquipe.nom}")
        }


    }
    fun equipeArmure(armureEquipe: Armure) {
        if (armureEquipe in this.inventaire) {
            var armurePrincipal = armureEquipe
            println("${this.nom} equipe ${armureEquipe.nom}")
        }
    }
}
