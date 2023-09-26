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
        do {

            val nomPerso = readln()
            var ptattaque: Int = readln().toInt()
            var ptdefense: Int = readln().toInt()
            var ptendurance: Int = readln().toInt()
            var ptvitesse: Int = readln().toInt()
            var pttotale: Int = ptattaque + ptdefense + ptendurance + ptvitesse
            while (pttotale > 40) {
                println("Error le cumul des point de stat sont superrieure à 40")
            }

            val pointDeVieMax = 100 + (10 * ptendurance)
            val hero = Personnage(nomPerso, 150, 150, 12, 8, 8, 12)
            this.joueur = hero
            return her
    }
}