package oop_00000117690_LouisAlexanderPutraAndreas.week12

sealed class FeederExceptions(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederExceptions(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException : FeederExceptions("Wadah dispenser tersangkut/macet!")