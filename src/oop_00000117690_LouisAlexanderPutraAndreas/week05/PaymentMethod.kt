package oop_00000117690_LouisAlexanderPutraAndreas.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}