package oop_00000117690_LouisAlexanderPutraAndreas.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Hello world")

    println("Isi IntBox: ${intBox.value}")
    println("Isi StringBox: ${stringBox.value}")
}