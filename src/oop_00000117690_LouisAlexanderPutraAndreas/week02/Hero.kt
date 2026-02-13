package oop_00000117690_LouisAlexanderPutraAndreas.week02

class Hero(val name: String, var hp: Int = 100, var baseDamage: Int){

    fun attack(targetName: String) = println("$name menebas $targetName!")

    fun takeDamage(damage: Int) = if (hp < 0) hp = 0 else hp -= damage

    fun isAlive(): Boolean = hp > 0
}