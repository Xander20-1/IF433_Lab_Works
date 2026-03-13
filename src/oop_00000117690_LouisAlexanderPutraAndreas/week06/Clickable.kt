package oop_00000117690_LouisAlexanderPutraAndreas.week06

interface Clickable {
    val name: String // Abstract property
    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}