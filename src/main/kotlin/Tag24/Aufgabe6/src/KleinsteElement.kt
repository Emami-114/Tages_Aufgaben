fun main() {
    val numbers = listOf(
        35, 35, 37, 246, 246, 357, 234, 4237, 476, 2346, 24, 347, 357, 67,
        52315, 346, 3567, 346, 235, 26, 357, 486, 457, 246, 246, 3247,
        35, 247, 2437, 274, 374, 35, 634, 35, 37, 2436, 43
    )
    min(numbers)
}
fun min(list:List<Int>){
    var min = list[0]
    for (zahl in list){
        if (zahl < min){
            min = zahl
        }
    }
    println(min)
}