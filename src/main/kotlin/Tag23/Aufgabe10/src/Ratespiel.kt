import kotlin.random.Random

fun main() {
    val computerGuess = Random.nextInt(1,5)
    do {
        print("Gibe deine Zahl ein: ")
        var input = readln().toInt()
        if (input == computerGuess){
            println("Du hast gewonnen!")
        }else if (input > computerGuess){
            println("deine zahl ist große als comuterZahl")
        }else if (input < computerGuess){
            println("deine zahl ist kleine als computerZahl")
        }
    }while (input != computerGuess)

}