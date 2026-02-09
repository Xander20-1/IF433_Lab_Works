package oop_00000117690_LouisAlexanderPutraAndreas.week01

fun main(){
    val price: Int = 20000
    val gameTitle: String = "RoboCat"
    var userNote: String? = null
    var finalPrice: Int = price - calculateDiscount(price = price)
    printReceipt(title = gameTitle, price = price, finalPrice = finalPrice, note = userNote ?:"Tidak ada catatan")
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 20/100 else price * 10/100

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String) = println("Judul: $title \nHarga Asli: Rp.$price \nHarga Akhir: Rp.$finalPrice \nCatatan User: $note")