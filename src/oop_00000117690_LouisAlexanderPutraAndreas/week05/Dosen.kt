package oop_00000117690_LouisAlexanderPutraAndreas.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // Wajib di-override karena fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}