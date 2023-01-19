fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    ).sorted()
    val sortedList = shirts.toMutableList()
    val blauShirt = mutableListOf<String>()
    val rootShirt = mutableListOf<String>()
    var i = 0
    while (i < shirts.size-1){
        if (shirts[i] == "blau"){
            blauShirt.add(shirts[i])
            sortedList.remove(shirts[i])
        }
        if (shirts[i] == "rot"){
            rootShirt.add(shirts[i])
            sortedList.remove(shirts[i])
        }
        i++
    }
    blauShirt.forEach { it -> println(it) }
    println(blauShirt.size)
    println(rootShirt.size)

}