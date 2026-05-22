package oop_00000117690_LouisAlexanderPutraAndreas.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // Bahaya: jika terjadi exception di baris ini
    // program akan crash dan metode writer.close tidak akan perna tereksekusi
    // file akan terus terkunci oleh OS

    // Wajib dipanggil secara manual jika tidak memakai blok 'use'
    writer.close()
    println("Proses penulisan unsafe selesai")
}