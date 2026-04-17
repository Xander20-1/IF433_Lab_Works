package oop_00000117690_LouisAlexanderPutraAndreas.week08

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {price ->
        // blok ini HANYA jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)
}