package oop_00000117690_LouisAlexanderPutraAndreas.week06

// Error: karena class Smartphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    // Manually Override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}