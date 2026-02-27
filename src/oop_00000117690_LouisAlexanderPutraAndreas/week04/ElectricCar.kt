package oop_00000117690_LouisAlexanderPutraAndreas.week04

open class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int) : Car(brand, numberOfDoors){

    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}