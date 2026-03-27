package oop_00000117690_LouisAlexanderPutraAndreas.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println(ItemRarity.LEGENDARY)

    val senjata1 = Weapon.forgeStarterSword()
    println(" Detail Senjata 1:\n" +
            "Nama Senjata: ${senjata1.item.name}\n" +
            "Damage Senjata: ${senjata1.item.damage}\n" +
            "Rariry Senjata: ${senjata1.item.rarity}\n" +
            "Durability Senjata: ${senjata1.durability}")

    println("=== SIMULASI ===")
    val senjata2 = senjata1.item.copy(name="pedang kayu upgrade",damage=25)

    println(" Detail Senjata 2:\n" +
            "Nama Senjata: ${senjata2.name}\n" +
            "Damage Senjata: ${senjata2.damage}\n" +
            "Rariry Senjata: ${senjata2.rarity}")

    val simulasi =  listOf(
        BattleState.Safezone,
        BattleState.MonsterEncounter("Goblin Nakal"),
        BattleState.LootDropped(senjata2),
        BattleState.GameOver("Terkena jebakan racun")
    )

    for (kejadian in simulasi){
        processEvent(kejadian)
    }

}