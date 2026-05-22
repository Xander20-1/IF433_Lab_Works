package oop_00000117690_LouisAlexanderPutraAndreas.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    try {
        val parts = line.split(",")

        if (parts.size != 5) {
            return null
        }

        return TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )

    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        return null
    }
}

// Write System
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

// Load System
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(
            id = 1,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 100.0,
            pnl = 25.5
        ),
        TradeRecord(
            id = 2,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 75.0,
            pnl = -10.0
        ),
        TradeRecord(
            id = 3,
            symbol = "BNBUSDT",
            type = "Long",
            margin = 50.0,
            pnl = 8.75
        )
    )

    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    println("Data trade berhasil disimpan.")
    println("Data korup berhasil ditambahkan untuk simulasi error.")

    val loadedData = loadTrades("crypto_trades.csv")

    val totalPnl = loadedData.sumOf { it.pnl }

    println("Total PnL bersih: $totalPnl")
}