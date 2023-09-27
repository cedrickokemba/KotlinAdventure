import item.Bombe
import item.Potion
import item.Qualite
import jeu.Jeu
import personnage.Personnage

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

fun main(args: Array<String>) {
    //Instantiation des bombes
    val Spike = Bombe(
        nom = "Spike",
        nombreDeDes = 4,
        maxDe = 6,
        description = "Le spike de Valorant pouvant détruire un site entier",
    )
    //Instantiation des potions
    val potionDeSoins = Potion(
        nom = "Potion De Soins",
        soin = 20,
        description = "Une potion qui contient un liquide rouge",
    )
    //Instantiation des monstres
    val gobelin = Personnage(
        "XXX le gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6)


    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf(gobelin))
    //Lancement du jeu
    jeu.lancerCombat()
}