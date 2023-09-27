package jeu

import personnage.Personnage



class Jeu(monstres: List<Personnage>) {
    lateinit var joueur: Personnage
    var combats: MutableList<Combat> = mutableListOf()
    var score: Int = 0

    // Corps du constructeur
    init {
        // Lancement de la création du personage du joueur
        this.creerPersonnage()
        // Pour chaque monstre dans la liste de monstres
        for (unMonstre in monstres) {
            // On créer un combat
            val unCombat = Combat(this, unMonstre)
            combats.add(unCombat)
        }
    }

    fun lancerCombat() {
        for (unCombat in this.combats) {
            unCombat.executerCombat()
            // Mettre à jour le score en fonction du nombre de tours
            val tours = unCombat.nombreTours
            score += calculerScore(tours)
        }
        println("Score final du joueur: $score")
    }

    private fun calculerScore(tours: Int): Int {
        // Par exemple, vous pouvez attribuer plus de points pour moins de tours
        return 500 - tours * 10
    }

    /**
     *  Méthode pour créer le personnage du joueur en demandant les informations à l'utilisateur
     *
     */
    fun creerPersonnage(): Personnage {
        println("Création votre personnage:")
        // TODO Mission 1.1
        val nomPerso = readln()
        var ptattaque: Int
        var ptdefense: Int
        var ptendurance: Int
        var ptvitesse: Int
        do {
            println("Veuillez attribuer vos points de statistique")

            println("Attaque : ")
            ptattaque= readln().toInt()

            println("Défense : ")
            ptdefense = readln().toInt()

            println("Endurance : ")
            ptendurance = readln().toInt()

            println("Vitesse : ")
            ptvitesse= readln().toInt()

            val pttotal: Int = ptattaque + ptdefense + ptendurance + ptvitesse
        }
            while (pttotal > 40)

            val pointDeVieMax = 50 + (10 * ptendurance)

            val hero = Personnage(nomPerso, pointDeVieMax, pointDeVieMax, 12, 8, 8, 12)
            this.joueur = hero
            return  hero 
    }
}