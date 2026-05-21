package oop_00000117690_LouisAlexanderPutraAndreas.week12

fun main() {
    println("=== TEST RUN CATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}