package oop_00000117690_LouisAlexanderPutraAndreas.week07

enum class ItemRarity(val dropChance: Int){
    COMMON(100),
    UNCOMMON(80),
    RARE(40),
    EPIC(20),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)
