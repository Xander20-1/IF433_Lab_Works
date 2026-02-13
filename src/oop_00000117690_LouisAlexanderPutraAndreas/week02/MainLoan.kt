package oop_00000117690_LouisAlexanderPutraAndreas.week02


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul: ")
    val judul = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    var nama = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var durasi = scanner.nextInt()

    scanner.nextLine()

    // Validasi di sisi pemanggil (Main)
    if (durasi < 0) {
        durasi = 1
    }

    val s1 = Loan(bookTitle = judul, borrower = nama, loanDuration = durasi)

    print("""
    Pendaftaran Peminjaman Buku Berhasil!
        
    Detail Peminjaman
    Judul: ${s1.bookTitle}
    Nama Peminjam: ${s1.borrower}
    Durasi: ${s1.loanDuration}
    Total Denda: ${s1.calculateFine()}
    """)



}