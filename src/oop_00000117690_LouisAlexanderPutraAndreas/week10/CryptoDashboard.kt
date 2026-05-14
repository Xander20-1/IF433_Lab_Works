package oop_00000117690_LouisAlexanderPutraAndreas.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    println("Daftar Aset Kripto:")

    response.data.forEach { koin ->
        println("- Nama Koin: ${koin.name} | Saldo: ${koin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TXN-001", 0.5))
    txRepo.add(Transaction("TXN-002", 2.0))
    txRepo.add(Transaction("TXN-003", 250.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("- ID: ${tx.id} | Amount: ${tx.amount}")
    }
}