package oop_00000117690_LouisAlexanderPutraAndreas.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if( value < 0){
                println("PERINGATAN! nilai damage tidak boleh lebih kecil dari 0!")
            } else if(value > 1000){
                field = 1000
                println("Nilai Damage sekarang adalah $field")
            }else{
                field = value
                println("Nilai Damage sekarang adalah $field")
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}
