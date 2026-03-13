package oop_00000117690_LouisAlexanderPutraAndreas.week06

import oop_00000117690_LouisAlexanderPutraAndreas.week05.PaymentMethod

fun main() {
    val smartLamp1 = SmartLamp("1", name = "Ruang Tamu")
    val smartSpeaker1 = SmartSpeaker("1", name = "Google Nest Dapur")
    val smartCCTV1 = SmartCCTV(id = "1", name = "Ezviz Garasi")

    val deviceList: List<SmartDevice> = listOf(smartLamp1, smartSpeaker1, smartCCTV1)
    val hub = SmartHomeHub()

    deviceList.forEach {device ->
        hub.addDevice(device)
    }

    println("========")
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}