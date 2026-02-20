package oop_00000117690_LouisAlexanderPutraAndreas.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // Kode di bawah ini salah karena memanggil setter di dalam setter
            this.salary = value
        }
}