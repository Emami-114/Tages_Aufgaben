class Pinguin(var gewicht:Double,var canFly:Boolean=false):Vogel(gewicht, canFly) {


    fun waddle(){
        println("Waddle waddle...")
    }
}