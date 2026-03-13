package oop_00000117690_LouisAlexanderPutraAndreas.week06

class SmartCCTV(override val id : String, override var name : String) : SmartDevice, Switchable, Recordable
{
    override fun startRecord() {
        println("SmartCCTV $name mulai merekam.")
    }

    override fun stopRecord() {
        println("SmartCCTV $name berhenti merekam.")
    }
    override fun turnOn(){
        println("SmartCCTV $name turned on")
        startRecord()
    }
    override fun turnOff(){
        println("SmartCCTV $name turned off")
        stopRecord()
    }
}
