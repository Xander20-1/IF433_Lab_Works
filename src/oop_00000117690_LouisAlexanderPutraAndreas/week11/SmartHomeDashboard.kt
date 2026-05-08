package oop_00000117690_LouisAlexanderPutraAndreas.week11


fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLamp = SmartDevice(name="Philips WiZ Living Room",
            category="Lighting"
    ).apply{
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
    }

    val camera = SmartDevice(
        "Ezviz Outdoor",
        "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acDevice = run {
        val ac = SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
        ac
    }
    // Tambahkan ke list
    homeDevices.add(acDevice)
    // Tambahkan alat pakan peliharaan
    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {

        println("=== RINGKASAN SMART HOME ===")
        println("Jumlah perangkat: ${this.size}")

    }
}