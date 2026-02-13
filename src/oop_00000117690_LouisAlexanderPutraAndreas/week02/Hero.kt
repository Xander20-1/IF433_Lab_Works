package oop_00000117690_LouisAlexanderPutraAndreas.week02

import java.util.Scanner

class Hero(val name: String, var hp: Int = 100, var baseDamage: Int) {

    fun attack(targetName: String) = println("$name menebas $targetName!")

    fun takeDamage(damage: Int) = if (hp < 0) hp = 0 else hp -= damage

    fun isAlive(): Boolean = hp > 0
}


fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp = 100
    println("--- GAME ---")

    print("Nama Hero: ")
    var name = scanner.nextLine()

    print("Stat Damage: ")
    var statDamage = scanner.nextInt()

    val hero1 = Hero(name = name, baseDamage = statDamage)

    while (hero1.isAlive() && enemyHp > 0) {
        print("\nMenu: \n1. Serang \n2. Kabur \nPilihan: ")
        var input = scanner.nextInt()
        print("\n")
        if (input == 1){
            enemyHp -= hero1.baseDamage
            println("Sisa Hp musuh: ${enemyHp}")
            if (enemyHp < 0){
                enemyHp = 0
            }
            if (enemyHp > 0){
                hero1.takeDamage((10..20).random())
                println("Musuh Menyerang!")
                if (hero1.hp < 0){
                    hero1.hp = 0
                }
                println("Sisa Hp Hero: ${hero1.hp}")
            }
        } else if (input == 2){
            println("Hero Kabur")
            break
        }
    }

    if (hero1.hp > enemyHp){
        println("Hero Menang!")
    }else {
        println("Enemy Menang!\n")
    }

    println("Hp Akhir: \nHero: ${hero1.hp} \nEnemy: ${enemyHp}")

}