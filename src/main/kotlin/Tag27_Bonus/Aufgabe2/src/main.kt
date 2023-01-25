fun main() {

    var person1: Person33 = Person33("Peter", 13, 150)
    var person2: Person33 = Person33("Sabine", 24, 172)
    var person3: Person33 = Person33("Anne", 12, 155)

    //Hier drunter kannst du die listeAnPersonen anlegen
    val personList = mutableListOf<Person33>(person1,person2,person3)
   println(darfMitFahren(person1))
   println(darfMitFahren(person2))
   println(darfMitFahren(person3))

}
//hier drunter kannst du deine Tag27_Bonus.darfMitFahren-Funktion hinschreiben:
fun darfMitFahren(person:Person33):Boolean{
    return person.alter >= 12 && person.große >= 155
}