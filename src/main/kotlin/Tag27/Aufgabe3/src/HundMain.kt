fun main() {
    val hund1 = Hund("Tag27.Hund",1,"Tag27.Hund")
    val hund2 = Hund("Tag27.Hund",1,"Tag27.Hund")
    val hund3 = Hund("Tag27.Hund",1,"Tag27.Hund")
    hund1.bellen()
    hund2.altern()
    println("HundName: ${hund2.hundName} Rasser: ${hund2.rasser} Alter: ${hund2.alter}")
}