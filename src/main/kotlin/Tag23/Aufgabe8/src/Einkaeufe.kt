fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )

    for (i in 0 until shoppingList.size){
        println("${i+1} --> ${shoppingList[i]}")
    }

}