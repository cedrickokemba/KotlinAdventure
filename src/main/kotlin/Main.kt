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

val EpeeDeLaMort = TypeArme (1 ,8, )

fun main(args: Array<String>) {
    //Instantiation des bombes
    val bombeSplash = Bombe(
        nom = "Bombe Splash",
        nbDe = 4,
        maxDe = 6,
        description = "Une bombe classique mais redoutable",
    )

    val bombeBallon = Bombe(
        nom = "Bombe Ballon",
        nbDe = 2,
        maxDe = 8,
        description = "Une bombe légère mais pouvant être dévastatrice"
    )

    val bombeRobot = Bombe(
        nom = "Bombe Robot",
        nbDe = 3,
        maxDe = 7,
        description = "Une bombe à tête chercheuse"
    )

    val bombeGluante = Bombe(
        nom = "Bombe gluante",
        nbDe = 1,
        maxDe = 11,
        description = "Une bombe qui s'accroche à l'adversaire"
    )

    val bombeFlash = Bombe(
        nom = "Flash",
        nbDe = 5,
        maxDe = 3,
        description = "Grenade aveuglant l'ennemi"
    )

    val molotov = Bombe(
        nom = "Cocktail molotov",
        nbDe = 8,
        maxDe = 5,
        description = "Parfaite pour TOUT brûler"
    )

    val grenadeParalysante = Bombe(
        nom = "Grenade paralysante",
        nbDe = 5,
        maxDe = 5,
        description = "Paralyse l'ennemi et l'empêche de bouger laissant l'adversaire vulnérable"
    )




    //Instantiation des potions
    val potion = Potion(
        nom = "Potion",
        soin = 25,
        description = "Une potion simple mais efficace"
    )

    val superPotion = Potion(
        nom = "Super Potion",
        soin = 50,
        description = "Une potion de bonne qualité"
    )

    val hyperPotion = Potion(
        nom = "Hyper Potion",
        soin = 75,
        description = "Une excellente potion"
    )

    val guerison = Potion(
        nom = "Guérison",
        soin = 100,
        description = "Soigne tous les maux"
    )




    //Instantiation des monstres
    val gobelin = Personnage(
        "gobelin",
        pointDeVie = 20,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        endurance = 6,
        vitesse = 11)

    val ameEnPeine = Personnage(
        "Ame en peine",
        pointDeVie = 67,
        pointDeVieMax = 67,
        attaque = 10,
        defense = 12,
        endurance = 0,
        vitesse = 14)

    val armureAnimee = Personnage(
        "Armure animée",
        pointDeVie = 33,
        pointDeVieMax = 33,
        attaque = 8,
        defense = 15,
        endurance = 8,
        vitesse = 6)

    val ettin = Personnage(
        "Ettin",
        pointDeVie = 88,
        pointDeVieMax = 88,
        attaque = 16,
        defense = 12,
        endurance = 14,
        vitesse = 8)

    val elementaireDeFeu = Personnage(
        "Elémentaire de feu",
        pointDeVie = 102,
        pointDeVieMax = 102,
        attaque = 12,
        defense = 10,
        endurance = 8,
        vitesse = 16)

    val flagelleurMental = Personnage(
        "Flagelleur mental",
        pointDeVie = 71,
        pointDeVieMax = 71,
        attaque = 15,
        defense = 7,
        endurance = 10,
        vitesse = 12)

    val geleeOcre = Personnage(
        "Gelée ocre",
        pointDeVie = 45,
        pointDeVieMax = 45,
        attaque = 9,
        defense = 14,
        endurance = 7,
        vitesse = 10)

    val gnoll = Personnage(
        "Gnoll",
        pointDeVie = 25,
        pointDeVieMax = 25,
        attaque = 11,
        defense = 8,
        endurance = 11,
        vitesse = 14)

    val gorgone = Personnage(
        "Gorgone",
        pointDeVie = 114,
        pointDeVieMax = 114,
        attaque = 18,
        defense = 14,
        endurance = 14,
        vitesse = 9)

    val hommeLezard = Personnage(
        "Homme-Lézard",
        pointDeVie = 22,
        pointDeVieMax = 22,
        attaque = 11,
        defense = 13,
        endurance = 11,
        vitesse = 11)

    val kraken = Personnage(
        "Kraken",
        pointDeVie = 472,
        pointDeVieMax = 472,
        attaque = 18,
        defense = 15,
        endurance = 22,
        vitesse = 14)

    val mimique = Personnage(
        "Mimique",
        pointDeVie = 58,
        pointDeVieMax = 58,
        attaque = 14,
        defense = 10,
        endurance = 9,
        vitesse = 12)


    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf(gobelin, ameEnPeine, armureAnimee, ettin, elementaireDeFeu,flagelleurMental, geleeOcre, gnoll, gorgone, hommeLezard, kraken, mimique))
    //Lancement du jeu
    jeu.lancerCombat()
}