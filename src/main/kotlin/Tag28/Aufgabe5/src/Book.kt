class Book33 {
    var page1 = Page("Das ist der Anfang des Buches.")
    var page2 = Page("Jetzt sind wir auf Seite 2.")
    var page3 = Page("Hier haben wir gerade Seite 3. erreicht.")
    var page4 = Page("Nun sind wir bei der letzten Seite angekommen.")

    var list = mutableListOf<Page>(page1,page2,page3,page4)
}