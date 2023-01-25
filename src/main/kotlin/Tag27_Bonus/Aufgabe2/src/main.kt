fun main() {

    var person1: Person = Person("Peter", 13, 150)
    var person2: Person = Person("Sabine", 24, 172)
    var person3: Person = Person("Anne", 12, 155)

    //Hier drunter kannst du die listeAnPersonen anlegen
    val personList = mutableListOf<Person>(person1,person2,person3)
   println(darfMitFahren(person1))
   println(darfMitFahren(person2))
   println(darfMitFahren(person3))

}
//hier drunter kannst du deine Tag27_Bonus.darfMitFahren-Funktion hinschreiben:
fun darfMitFahren(person:Person):Boolean{
    return person.alter >= 12 && person.große >= 155
}