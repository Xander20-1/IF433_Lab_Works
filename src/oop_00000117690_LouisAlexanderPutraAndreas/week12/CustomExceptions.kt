package oop_00000117690_LouisAlexanderPutraAndreas.week12

// Custom exception dengan membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double){
    fun withdraw(amount: Double){
        if (amount < 0) {
            throw IllegalArgumentException("Negative amount can't be negative")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}