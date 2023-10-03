import item.Bombe
import item.Potion
import item.Qualite
import jeu.Jeu
import personnage.Personnage
import item.TypeArme
import item.TypeArmure
import item.Armure
import javax.lang.model.element.TypeElement

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

//Type d'arme
val dague = TypeArme ("Dague",1 ,4,3,18)
val baton = TypeArme ("Bâton",1 ,6,2,20)
val lance = TypeArme ("Lance",1 ,8,2,15)
val arbaleteLegere = TypeArme ("Arbalète légère",1 ,8,2,15)
val epeeLongue = TypeArme ("Épée longue",1 ,8,2,15)
val hache = TypeArme ("Hâche",1 ,8,2,15)
val epeeCourte = TypeArme ("É",1 ,8,2,15)
val marteauDeGuerre = TypeArme ("Shinra Tensei",1 ,8,2,15)
val arcLong = TypeArme ("Shinra Tensei",1 ,8,2,15)

//Type d'armure

val rembourre = TypeArmure("Rembourré", 1)
val cuir = TypeArmure("cuir", 2)
val cuirCloute = TypeArmure("Cuir clouté", 3)
val cotteDeMailles = TypeArmure("Cotte de mailles", 6)

// Armure
val cotteDeMaillesAdamantine = Armure(
    "Cotte de mailles en adamantine + 1",
    "Cotte de mailles plus lourde mais aussi plus solide.",
    qualiteRare,
    cotteDeMailles
)

val manteauDelaNuit = Armure(
    "Le manteau de la nuit",
    "Une armure en cuir obscure comme la nuit",
    qualiteEpic,
    cuir
)

val armureDuGobelin = Armure(
    "Armure du gobelin ",
    "Armure en cuir rudimentaire",
    qualiteCommun,
    cuir
)

//BOMBES
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
    nbDe = 3,
    maxDe = 5,
    description = "Grenade aveuglant l'ennemi"
)

val molotov = Bombe(
    nom = "Cocktail molotov",
    nbDe = 5,
    maxDe = 8,
    description = "Parfaite pour TOUT brûler"
)

val grenadeParalysante = Bombe(
    nom = "Grenade paralysante",
    nbDe = 3,
    maxDe = 9,
    description = "Paralyse l'ennemi et l'empêche de bouger laissant l'adversaire vulnérable"
)

//POTIONS

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

fun main(args: Array<String>) {
    //Instantiation des bombes


    //Instantiation des potions


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