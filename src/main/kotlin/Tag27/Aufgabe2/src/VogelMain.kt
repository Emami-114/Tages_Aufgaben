fun main() {
val vogel1 = Vogel("Amsel","Ameisen")
val vogel2 = Vogel("Drossel","Beeren")
val vogel3 = Vogel("Amsel","Ameisen",1)
    println("${vogel3.vogelType}  ${vogel3.futtertypen}  ${vogel3.age}")

    vogel3.zwitschern()
}