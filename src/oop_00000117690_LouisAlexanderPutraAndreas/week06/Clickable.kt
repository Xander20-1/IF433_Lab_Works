package oop_00000117690_LouisAlexanderPutraAndreas.week06

interface Clickable {
    // Error: karena di interface tidak bisa menyimpan backing field
    val name: String = "Tombol Rahasia"

    // Function without body
    fun click()
}