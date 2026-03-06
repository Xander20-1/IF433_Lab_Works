package oop_00000117690_LouisAlexanderPutraAndreas.week05

class Ewallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(amount > balance){
            balance -= amount
            println("Transaksi Sukses!")
        }else{
            println("Saldo tidak cukup!")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}