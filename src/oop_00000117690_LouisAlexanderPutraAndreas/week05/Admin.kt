package oop_00000117690_LouisAlexanderPutraAndreas.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    // Fungsi unik yang hanya dimiliki admin
    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}