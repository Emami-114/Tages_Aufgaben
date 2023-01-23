fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
   multi(numbers,3)

}
fun multi(numbers:MutableList<Double>,multiZahl:Int){
    var i = 0
    while (i < numbers.size){
        val multiple = numbers[i]*multiZahl
        numbers[i] = multiple

        i++
    }
    numbers.forEach { it -> println(it) }
}
