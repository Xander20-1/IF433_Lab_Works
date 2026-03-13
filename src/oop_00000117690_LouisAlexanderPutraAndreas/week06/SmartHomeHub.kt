package oop_00000117690_LouisAlexanderPutraAndreas.week06

class SmartHomeHub(){
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("Berhasil menambahkan ${device.name}")
    }

    fun turnOffAllSwitches(){
        println("\nMematikan semua perangkat Switchable")
        for (device in devices){
            if (device is Switchable){
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode(){
        println("Menyalakan Security Mode...")
        for (device in devices){
            if (device is Recordable){
                device.startRecord()
            }else if (device is SmartSpeaker){
                device.playMusic("Sirine Peringatan")
            }
        }
    }

}
