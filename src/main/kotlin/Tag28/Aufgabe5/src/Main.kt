fun main() {

    val book = Book33().list
    for (page in 0..book.size-1){
        print("Seite ${page+1} : ")
        book[page].read()
    }
    println("Rückwerts")
    for (page in book.size-1 downTo 0){
        print("Seite ${page+1} : ")
        book[page].read()
    }
}