package oop_00000117690_LouisAlexanderPutraAndreas.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}