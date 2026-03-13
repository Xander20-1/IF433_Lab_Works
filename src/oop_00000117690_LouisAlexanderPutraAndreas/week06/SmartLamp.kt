package oop_00000117690_LouisAlexanderPutraAndreas.week06

class SmartLamp(override val id : String, override var name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("SmartLamp turned on")
    }
    override fun turnOff() {
        println("SmartLamp turned off")
    }
}