fun main() {
    // Wir haben jetzt genau einen Bauplan (die Klasse Tag26.Bus).
    // Aus dem Bauplan können wir beliebig viele Busse erstellen.
    // Ein erstellter Tag26.Bus heißt "Objekt" oder auch "Instanz".
    // So erstellen wir 3 Busse.
    var firstBus: Bus = Bus()
    var secondBus: Bus = Bus()
    var thirdBus: Bus = Bus()

    // Über die Punktnotation (Der Punkt "." nach dem Variablennamen) können alle Methoden des Busses verwendet werden.
    // Zum Beispiel die "honk" Methode.
    firstBus.honk()
    secondBus.durchSage()
    println("anzahl sitze: ${thirdBus.seats}")

    // Auch über die Punktnotation können wir Eigenschaften des Busses verwenden.
    // Hier geben wir in der Konsole aus, wieviel PS unser Tag26.Bus hat.
    val ps = firstBus.horsePower
    println("Ganze $ps PS hat unser Tag26.Bus.")

    // Hier verändern wir die Anzahl PS von unserem ersten Tag26.Bus.
    // Wir erhöhen die PS von unserem Tag26.Bus von 500 auf 750 PS. Ein ziemlich starker Tag26.Bus.
    firstBus.horsePower = 750
    var newPs = firstBus.horsePower
    println("Jetzt hat unser Tag26.Bus sogar $newPs PS!")

    // Beachte hierbei, dass wir nur die PS von unserem ersten Tag26.Bus angepasst haben.
    // Der zweite und der dritte Tag26.Bus haben immer noch nur 500 PS.
    println("PS des zweiten Busses: ${secondBus.horsePower}")
    println("PS des dritten Busses: ${thirdBus.horsePower}")

    // Nachdem euer erstellter Tag26.Bus einmal gehupt hat, soll über einen Funktionsaufruf die Durchsage getätigt werden.
    // Hier drunter könnten ihr weitercoden:

}