package oop_00000117690_LouisAlexanderPutraAndreas.week04

fun main() {
    println("--- Employee Hierarchy Test ---")
    val employee1 = Manager(name="Louis", baseSalary= 20000000)
    val employee2 = Developer(name="Loky", baseSalary= 22000000, programmingLanguage= "Kotlin")

    println("Employee 1 \nName: ${employee1.name}, \nBase salary: Rp.${employee1.baseSalary}\n")
    println("Employee 2 \nName: ${employee2.name}, \nBase salary: Rp.${employee2.baseSalary}, \nProgramming Language: ${employee2.programmingLanguage}\n")

    employee1.work()
    println("${employee1.name} menerima bonus sebesar Rp.${employee1.calculateBonus()}")
    employee2.work()
    println("${employee2.name} menerima bonus sebesar Rp.${employee2.calculateBonus()}")
}