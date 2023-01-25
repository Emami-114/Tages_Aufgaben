fun main() {
val flug = Airplane(4,0.0)
    flug.takeOff()

}

class Airplane(var amountTurbines: Int, var flyingSpeed: Double) {
    var isAirborne: Boolean = false

    fun takeOff(){
        if (!isAirborne){
            isAirborne = true
        }
    }
    fun  land(){
        if (flyingSpeed > 0.0){
            isAirborne = false
        }
    }
}