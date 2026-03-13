package oop_00000117690_LouisAlexanderPutraAndreas.week06

class SmartSpeaker(override val id : String, override var name : String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("SmartSpeaker $name turned on")
    }

    override fun turnOff() {
        println("SmartSpeaker $name turned off")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}