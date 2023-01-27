class Pedestrian(farbe:String,name: String,kreuzungBisZumZiel: Int,kreuzungDieBreitsUberquert: Int): TrafficLight(farbe) {
    var name:String = name
    var kreuzungBisZumZiel = kreuzungBisZumZiel
    var kreuzungDieBreitsUberquert:Int = kreuzungDieBreitsUberquert


    fun ampel(){
        if (this.farbe == "Grün"){
            println("Straße überqueren")
            kreuzungDieBreitsUberquert--
        }else{
            println("Stehen Bleiben")
        }
    }
}