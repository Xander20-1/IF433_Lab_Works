package oop_00000117690_LouisAlexanderPutraAndreas.week13

import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Insialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")

    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText() // Mengambil seluruh isi file
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines() // Mengambil per baris sebagai List<String>
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}