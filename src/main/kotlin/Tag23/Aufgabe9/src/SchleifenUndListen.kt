fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")
    for (i in satz.reversed()) {
        print(i)
    }
    println("\n----------------------------")
    for (j in satz.size-1 downTo 0 step 2){
        print(satz[j-1])
    }
    println("\n----------------------------")

    for (j in satz.size-1 downTo 3){
        println(satz[j])
    }

}