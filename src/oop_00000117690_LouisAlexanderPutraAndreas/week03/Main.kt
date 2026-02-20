package oop_00000117690_LouisAlexanderPutraAndreas.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n")

    val p1 = Player("Lou")

    //p1.xp
    p1.addXp(50)
    println("Level ${p1.level}")
    p1.addXp(60)
}