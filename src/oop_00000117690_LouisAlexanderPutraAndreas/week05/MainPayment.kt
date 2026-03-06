package oop_00000117690_LouisAlexanderPutraAndreas.week05

fun main() {
    val Ewallet1 = Ewallet(accountName= "Loky",balance= 50000.0)
    val creditCard1 = CreditCard(accountName= "Shiro", limit = 100000.0)

    val tipePembayaran: List<PaymentMethod> = listOf(Ewallet1, creditCard1)

    for (pembayaran in tipePembayaran) {
        pembayaran.processPayment(amount= 75000.0)
    }
}