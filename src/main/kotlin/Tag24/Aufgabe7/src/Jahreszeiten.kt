fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    for (monat in monate){
        when(monat){
            "Dezember","Januar","Februar" -> {
                println("Der $monat ist im Winter"
                )}
            "März", "April", "Mai" -> println("Der $monat ist im Frühling")
            "Juni","Juli", "August" -> println("Der $monat ist im Sommer")
            "September", "Oktober", "November" -> println("Der $monat ist im Herbst")
        }
    }


    println("\ngibe deine gewünschte monate: ")
     jahresZeit(monate, readln())
}
fun jahresZeit(list:List<String>,input:String){
    when(input){
       "Dezember","Januar","Februar" -> {
        println("Winter"
    )}
        "März", "April", "Mai" -> println("Frühling")
        "Juni","Juli", "August" -> println("Sommer")
        "September", "Oktober", "November" -> println("Herbst")
    }
}
//if (monat == "Dezember" || monat == "Januar" || monat == "Februar"){
//    println("\nDer $monat ist im Winter")
//}
//if (monat == "März" || monat == "April" || monat == "Mai"){
//    println("\nDer $monat ist im Frühling")
//}
//if (monat == "März" || monat == "April" || monat == "Mai"){
//    println("\nDer $monat ist im Frühling")
//}