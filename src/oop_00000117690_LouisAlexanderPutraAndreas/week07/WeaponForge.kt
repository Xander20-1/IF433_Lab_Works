package oop_00000117690_LouisAlexanderPutraAndreas.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            val pedangBapuk= GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(pedangBapuk, 50)
        }
        fun forgeEpicSword(): Weapon{
            val pedangEpic= GameItem("Pedang Epic", 50, ItemRarity.EPIC)
            return Weapon(pedangEpic, 100)
        }
    }
}