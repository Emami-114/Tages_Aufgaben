class Bruch {
    //Die zwei Klassenvariablen nicht verändern
    var zaehler: Int = 10
    var nenner: Int = 5

    //Hier drunter kannst du weitercoden:
    fun ausgeben(): String {
        return (this.zaehler / this.nenner).toString()
    }

    fun setze(z: Int=zaehler, n: Int=nenner) {

    }
    fun einlesen(z: Int,n: Int){

        if (n!=0){
            return setze(z= readln().toInt(),n= readln().toInt())
        }

    }
    fun wert(){

    }


}