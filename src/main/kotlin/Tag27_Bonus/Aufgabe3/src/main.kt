fun main() {
    var raceCar1: Racecar = Racecar("BMW")
    var raceCar2: Racecar = Racecar("Audi")
    var raceCar3: Racecar = Racecar("Opel")
    var raceCar4: Racecar = Racecar("Mercedes")
    var raceCar5: Racecar = Racecar("Fiat")
    var raceCar6: Racecar = Racecar("Ferrari")
    var raceCar7: Racecar = Racecar("Lambo")
    var raceCar8: Racecar = Racecar("Mitsubishi")


    //Hier drunter kannst du die listeVonAutos erstelen

    val rennList =
        mutableListOf<Racecar>(raceCar1, raceCar2, raceCar3, raceCar4, raceCar5, raceCar6, raceCar7, raceCar8)
    //Hier drunter kannst du den Rest programmieren
    rennList.forEach {  }
    var i = 0
    while (i < rennList.size - 1) {
        println("Das Rennen Nr: ${i+1}")
        val randomCar1 = rennList.random()
        val randomCar2 = rennList.random()

        werIstSchneller(randomCar1, randomCar2)
//        rennList.remove(randomCar1)
//        rennList.remove(randomCar2)
        i++
    }

println("Das Rennen ist vorbei")
}

