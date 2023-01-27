import kotlin.math.E

class EBike(position:String, geschwindigkeit:Int, rechweit:Int, ladeZeit:Int) {
    var position: String = position
    var geschwindigkeit: Int= geschwindigkeit
    var reichweit: Int = rechweit
    var ladeZeit: Int= ladeZeit

    fun position(distanz:Int){

        println("FahrZeit: $distanz")
    }
}

fun main() {
var ebike = EBike("Berlin",12,10,20)
    println("Standort: ${ebike.position} Geschwindigkeit: ${ebike.geschwindigkeit}km/h LadeZeit: ${ebike.ladeZeit}")
    ebike.position(ebike.reichweit)

}