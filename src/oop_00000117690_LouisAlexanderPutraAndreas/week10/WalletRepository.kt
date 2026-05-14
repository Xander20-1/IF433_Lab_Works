package oop_00000117690_LouisAlexanderPutraAndreas.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(searchName: String): T? {
        return items.find { item ->
            // Mengecek apakah item tersebut adalah tipe data Coin
            if (item is Coin) {
                item.name.equals(searchName, ignoreCase = true)
            } else {
                false
            }
        }
    }
}