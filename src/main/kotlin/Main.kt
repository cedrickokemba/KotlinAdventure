import classePersonnage.Sort
import item.Bombe
import item.Potion
import item.Qualite
import jeu.Jeu
import personnage.Personnage
import personnage.Monstre
import item.TypeArme
import item.TypeArmure
import item.Armure
import item.Arme
import jeu.TirageDes
import javax.lang.model.element.TypeElement

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

//Type d'arme
val dague = TypeArme ("Dague",1 ,4,3,18)
val baton = TypeArme ("Bâton",1 ,6,2,20)
val lance = TypeArme ("Lance",1 ,8,3,20)
val arbaleteLegere = TypeArme ("Arbalète légère",1 ,8,2,19)
val epeeLongue = TypeArme ("Épée longue",1 ,8,2,19)
val hache = TypeArme ("Hâche",1 ,8,3,20)
val epeeCourte = TypeArme ("Épée Courte",1 ,8,2,19)
val marteauDeGuerre = TypeArme ("Marteau de guerre",1 ,8,3,20)
val arcLong = TypeArme ("Arc long",1 ,8,3,20)

//Arme

val edict= Arme(
    "Edict",
    "Une dague légendaire en mithril",
    qualiteLegendaire,
    dague
)

val epeeLongueDuDroit= Arme(
    "Épée longue du droit",
    "Une épée en fer froid",
    qualiteRare,
    epeeLongue
)

val lanceDuKobold= Arme(
    "Lance du Kobold",
    "Une lance rudimentaire",
    qualiteCommun,
    lance
)

val hachePlusDeux= Arme(
    "Hache +2",
    "Une hache tranchante",
    qualiteEpic,
    hache
)

val tonnerre= Arme(
    "Tonnerre",
    "Un marteau légendaire frappe comme la foudre",
    qualiteLegendaire,
    marteauDeGuerre
)

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

// Sort

val bouleDeFeu = Sort("Boule de feu", { caster, cible  ->
    run {
        val degatsCaster = caster.attaque/3
        val tirageDes = TirageDes(1,6)
        var degat = tirageDes.lance()
        degat+= degatsCaster
        degat -= cible.calculeDefense()
        cible.pointDeVie -= degat
        println("Boule de feu inflige $degat à ${cible.nom} ")
    }
})

val missileMagique = Sort("Missile magique", { caster, cible ->
    run {
        val degatsCaster = caster.attaque/2
        val tirageDes = TirageDes(1,6)
        var compteur = 0
        if (compteur<degatsCaster){
            var degat = tirageDes.lance()
            degat -= cible.calculeDefense()
            cible.pointDeVie -= degat
            println("Le projectile magique inflige $degat à ${cible.nom} ")
            compteur += 1
        }
    }
})

val sortDeSoin = Sort("Sort de soin",{ caster, cible ->
    run {
        val tirageDes = TirageDes (1,6)
        val scoreAttaque = caster.attaque/2
        var soin = tirageDes.lance()+ scoreAttaque
        caster.pointDeVie += soin
        if(caster.pointDeVie>caster.pointDeVieMax){
            val soinProcure = caster.pointDeVieMax - caster.pointDeVie
            caster.pointDeVie=caster.pointDeVieMax
            println("Sort de soin a soigné ${caster.nom} de $soinProcure pv")
        } else{
            println("Sort de soin a soigné ${caster.nom} de $soin pv")
        }
    }
})


// arme magique

val invocationArmeMagique = Sort("Invocation d'arme magique", { caster, cible ->
    run {
    val tirageDes = TirageDes(1, 20)
    val resultatTirage = tirageDes.lance()
    var qualite: Qualite? = null

    when{
        resultatTirage < 5 -> qualite = qualiteCommun
        resultatTirage < 10 -> qualite = qualiteRare
        resultatTirage < 15 -> qualite = qualiteEpic
        else -> {
            qualite = qualiteLegendaire
        }
    }

    val armeMagique = Arme("Arme magique", "une arme magique invoquée via un sort", qualite, epeeLongue)
    caster.inventaire.add(armeMagique)
    caster.equipeArme(armeMagique)

     println("L'arme magique à été ajoutée à l'inventaire.")
    }
})




//armure magique

val invocationArmureMagique = Sort("Invocation armure magique", { caster, cible ->
    run {
        val tirageDes = TirageDes(1, 20)
        val resultatTirage = tirageDes.lance()
        var qualite: Qualite? = null

        when{
            resultatTirage < 5 -> qualite = qualiteCommun
            resultatTirage < 10 -> qualite = qualiteRare
            resultatTirage < 15 -> qualite = qualiteEpic
            else -> {
                qualite = qualiteLegendaire
            }
        }

        val armureMagique = Armure("Armure magique", "une armure magique invoquée via un sort", qualite, epeeLongue)
        caster.inventaire.add(armureMagique)
        caster.equipeArmure(armureMagique)

        println("L'arme magique à été ajoutée à l'inventaire.")
    }
})
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
        armePrincipale = lanceDuKobold,
        armurePrincipale = null,
        vitesse = 11)



    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf(gobelin))
    //Lancement du jeu
    jeu.lancerCombat()
}