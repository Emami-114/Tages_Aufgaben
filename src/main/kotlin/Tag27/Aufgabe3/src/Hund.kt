class Hund {
    var hundName:String
    var alter:Int
    var rasser:String
    constructor(hundName:String,alter:Int,rasser:String){
        this.hundName=hundName
        this.alter=alter
        this.rasser=rasser
    }
    fun bellen(){
        println("woof!")
    }
    fun altern(){
        this.alter++
    }

}