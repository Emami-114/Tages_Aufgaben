class Car {
    var ps:Int
    var color:String
    var seats:Int = 0
    var freeSeats:Int = seats
    constructor(ps:Int,color:String,seats:Int,freeSeats:Int){

        this.ps=ps
        this.color=color
        if (seats > 0){
        this.seats=seats
        }else println("sitze kann nicht - sein")
        this.freeSeats=freeSeats
    }

    fun getIn(){
        if (this.freeSeats > 0){
            freeSeats--
        }else println("keine freier platz")
    }
    fun getOut(){
        if (this.freeSeats < this.seats){
            freeSeats++
        }
    }
    fun startEngine(){
        if (this.freeSeats < seats){
            println("wroom wroom")
        }else println("muss mindestens eine platz beleg sein")
    }
}