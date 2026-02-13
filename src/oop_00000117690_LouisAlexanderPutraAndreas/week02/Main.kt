package oop_00000117690_LouisAlexanderPutraAndreas.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti disini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi Objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis terisi dengan nilai default
        val s2 = Student(name, nim)
        println("Terdaftar di ${s2.major} dengan GPA awal ${s2.gpa}")
    }else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}