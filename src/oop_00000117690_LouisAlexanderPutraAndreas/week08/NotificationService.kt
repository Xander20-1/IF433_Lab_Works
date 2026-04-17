package oop_00000117690_LouisAlexanderPutraAndreas.week08

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        // sendEmail(user.email) // akan error karena type mismatch

        if (user.email != null){
            // SUCCESS via Smart Cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else{
            println("User ${user.name} tidak memiliki email.")
        }
    }
}