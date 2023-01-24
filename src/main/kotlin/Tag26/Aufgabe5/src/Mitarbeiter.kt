class Mitarbeiter(  var id:Int = 0,
                    var name:String = "",
                    var position:String = "",
                    var gehalt:Double = 0.0,
                    var artDerBeschäftigung:String = "",
                    var mutterschaftsUrlaub:Boolean =false){



    fun gehaltAusgeben(){
        println("Name der Tag26.Mitarbeiter: ${this.name} und gehalt: ${this.gehalt}")
    }
    fun befoerdern(){
        println("Position ${this.position} und Gehalt: ${this.gehalt}")
    }
    fun istVerfuegbar(){
        println("${this.name} hat mutterschaft urlaub.")
    }
}