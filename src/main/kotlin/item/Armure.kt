package item

import personnage.Personnage
class Armure (
        nom: String,
        description:String,
        val qualite: Qualite,
        val typeArmure: TypeArmure): Item(nom,description){


    fun calculeProtection(): Int{
        var additionProtection = this.typeArmure.bonusType + this.qualite.bonusRarete
        return additionProtection
    }

   override fun utiliser(personnage: Personnage){

    }
}