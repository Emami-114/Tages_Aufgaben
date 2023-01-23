fun main() {
    val mitarbeiter = mutableListOf<Mitarbeiter>(
        Mitarbeiter(1, "String", "CEO", 100.0, "", 0),
        Mitarbeiter(2, "Double", "", 70.0, "", 10),
        Mitarbeiter(1, "String", "", 50.0, "", 20),

        )

    for (mitarbeit in mitarbeiter) {
        println("${mitarbeit.name} -> Position: ${mitarbeit.position} -> Gehalt: ${mitarbeit.gehalt}€ -> artDerBeschäftigung: ${mitarbeit.artDerBeschäftigung} -> MutterschaftUrlaub: ${mitarbeit.mutterschaftsUrlaub}")
    }
}