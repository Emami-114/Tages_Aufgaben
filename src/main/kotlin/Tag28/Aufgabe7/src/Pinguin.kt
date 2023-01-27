class Pinguin(var gewicht:Double,var canFly:Boolean=false):Vogel33(gewicht, canFly) {
    override fun makeNoise() {
        super.makeNoise()
    }
    fun waddle(){
        println("Waddle waddle...")
    }

}

class Huhn(gewicht: Double,canFly: Boolean) : Vogel33(gewicht, canFly){
    fun huhn(gewicht: Double,canFly: Boolean){

    }

}