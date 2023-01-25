//Hier drunter kannst du die Klasse RaceCar anlegen:
class Racecar {
    var model: String
    var geschwindigkeit: Int

    constructor(model: String, geschwindigkeit: Int=(170..200).random()) {
        this.model = model
        this.geschwindigkeit = geschwindigkeit
    }

}

//Hier drunter kannst du deine Tag27_Bonus.werIstSchneller Funktion hinterlegen
fun werIstSchneller(raceCare1: Racecar, raceCar2: Racecar): Racecar {
    return if (raceCare1.geschwindigkeit > raceCar2.geschwindigkeit) {
        println("Rennen zwischen ${raceCare1.model} und & ${raceCar2.model} hat gewonnen: ${raceCare1.model}")
        raceCare1
    } else {
        println("Rennen zwischen ${raceCare1.model} und & ${raceCar2.model} hat gewonnen: ${raceCar2.model}")
        raceCar2
    }
}