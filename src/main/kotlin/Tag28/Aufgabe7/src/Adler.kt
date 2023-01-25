class Adler(var gewicht:Double, var canFly: Boolean = true):Vogel(gewicht, canFly){

    fun fly(){
        println("Fly free like an eagle!")
    }
}