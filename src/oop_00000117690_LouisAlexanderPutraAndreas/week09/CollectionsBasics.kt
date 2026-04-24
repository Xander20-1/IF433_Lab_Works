package oop_00000117690_LouisAlexanderPutraAndreas.week09

fun main(){
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah
    val frameworks: List<String> = listOf("Kotlin", "Java","C++")
    // frameworks.add("Python") // Jika di-uncomment akan error
    println("Immutable List: $frameworks")

    // Mutable List: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] =88
    println("Mutable List: $scores")
}