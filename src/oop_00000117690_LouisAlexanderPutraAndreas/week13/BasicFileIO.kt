package oop_00000117690_LouisAlexanderPutraAndreas.week13

import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Insialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")
}