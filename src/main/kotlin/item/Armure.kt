package item

import personnage.Personnage

class Armure {
    class Armures {
        val nom: String,
        val description:String,
        val qualite: Qualite,
        val type: TypeArmure,
    }

    fun calculeProtection(): Int{
        var additionProtection = this.typeArmure.bonustype + this.Qualite.bonusRarete
        return additionProtection
    }
}