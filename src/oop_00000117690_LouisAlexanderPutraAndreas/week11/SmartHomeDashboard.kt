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
}