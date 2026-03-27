package oop_00000117690_LouisAlexanderPutraAndreas.week07

fun processEvent(event:BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("⚔️ Seekor ${event.monsterName} menghadang jalan Pemain!")
        }

        is BattleState.LootDropped -> {
            println("🎁 Pemain menemukan ${event.item.name} (Rarity: ${event.item.rarity.name})")
        }

        is BattleState.GameOver -> {
            println("💀 GAME OVER... Alasan kekalahan: ${event.reason}")
        }

        BattleState.Safezone -> {
            println("⛺ Pemain tiba di Safezone.")
        }
    }
}