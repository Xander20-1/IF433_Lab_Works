package oop_00000117690_LouisAlexanderPutraAndreas.week01

fun main(){
    val price: Int = 10000
    val gameTitle: String = "RoboCat"

    printReceipt(title = gameTitle, price = price, finalPrice = price - calculateDiscount(price = price))
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 20/100 else price * 10/100

fun printReceipt(title: String, price: Int, finalPrice: Int) = println("Judul: $title \nHarga Asli: Rp.$price \nHarga Akhir: Rp.$finalPrice")