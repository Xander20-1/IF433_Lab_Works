package oop_00000117690_LouisAlexanderPutraAndreas.week04

// Gunakan keyword 'open' agar class bisa diwariskan
open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method bersifat final secara default. 'open' digunakkan agar bisa di-override.
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}