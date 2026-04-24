package oop_00000117690_LouisAlexanderPutraAndreas.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 50, roe = 125.5, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 20, roe = -45.0, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 100, roe = 15.2, status = "OPEN"),
        TradeLog(pair = "SOLUSDT", position = "LONG", leverage = 10, roe = -12.5, status = "OPEN"),
        TradeLog(pair = "ETHUSDT", position = "LONG", leverage = 25, roe = 60.0, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 50, roe = -100.0, status = "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}