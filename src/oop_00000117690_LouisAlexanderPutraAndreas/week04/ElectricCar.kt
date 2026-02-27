package oop_00000117690_LouisAlexanderPutraAndreas.week04

open class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int) : Car(brand, numberOfDoors){

    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}

fun main() {
    println("--- Electric Car Test ---")
    val mobil = ElectricCar(brand="Mercedes", numberOfDoors=2, batteryCapacity=100)
    mobil.accelerate()
    mobil.honk()
    mobil.accelerate()
}