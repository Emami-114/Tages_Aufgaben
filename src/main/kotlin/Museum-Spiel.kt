import java.lang.Exception

//TODO: hier dein Code
fun main() {
    val museum = mutableMapOf<String, Double>(
        "Seurat" to 149.9,
        "Nu couché" to 170.4,
        "Three Studies of Lucian Freud (Triptychon)" to 157.0
    )
    val diebListe: MutableMap<String, Double> = mutableMapOf()
    while (true) {
        try {
        var verdacht = (0..100).random()
        var bilderZumStehlen = museum.keys.random()
        println("Gemelde          Preise")
        println("------------------------------")
        println("${bilderZumStehlen}           ${museum[bilderZumStehlen]}€")
        println("\nrisiko: $verdacht%")
        println("\nMöchtest du riskieren?? ja/nein")
            val input = readln()

            if (input == "ja") {

                if (verdacht < 25) {
                    println("Unse hat polizei er wicht!!!")
                    break
                } else if (verdacht >= 25) {
                    diebListe.put(bilderZumStehlen, museum[bilderZumStehlen]!!)
                    println("${bilderZumStehlen} wurde erfolgreich gestohlen")
                    verdacht -= 10
                    museum.remove(bilderZumStehlen, museum[bilderZumStehlen]!!)
                }

            } else break

        } catch (ex: Exception) {

            println("Keine bild vorhanden")
            break

        }
    }
}


