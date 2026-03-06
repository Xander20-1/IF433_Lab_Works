package oop_00000117690_LouisAlexanderPutraAndreas.week05

class MathHelper {
    fun hitungLuas(sisi: Int): Int{
        return (sisi * sisi)
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int{
        return (panjang * lebar)
    }

    fun hitungLuas(jariJari: Double): Double{
        return (3.14 * jariJari * jariJari)
    }
}

fun main() {
    val luas = MathHelper()
    println("Luas Persegi: ${luas.hitungLuas(sisi= 2)} cm")
    println("Luas Persegi Panjang: ${luas.hitungLuas(20, 10)} cm")
    println("Luas Lingkaran: ${luas.hitungLuas(10.0)} cm")
}