/*In dieser Aufgabe sollst du nach Vorgaben eine Klasse erstellen und bestimmte Methoden (Funktionen) anlegen.

Öffne die Datei Tag26.Maus und erstelle eine Klasse namens Tag26.Maus.

Nun erstelle folgende Methoden: Die Methoden geben jeweils einen Text in der Konsole aus.

kaeseEssen(), welche "Yummy, Käse!" ausgibt
vorMenschenWegRennen(), welche "Rennen, rennen, rennen!" ausgibt
tunnelGraben(), welche "Grab, grab!" ausgibt
verstecken(), welche "Versteckt!" ausgibt
Nachdem du alle Methoden erstellt hast, öffne die Main.kt Datei.

Erstelle (instanziiere) eine Tag26.Maus.
(Hinweis: Falls es zu schwer sein sollte, schau in die Main.kt aus Aufgabe 1 im ModulA nach und orientiere dich danach)

Nachdem die Tag26.Maus erstellt wurde, soll sie in dieser Reihenfolge folgende Aktionen durchführen:

vor Menschen wegrennen
Käse essen
Tunnel graben
sich verstecken
Wenn du nun dein Programm laufen lässt, sollte folgendes in der Konsole zu sehen sein.

Rennen, Rennen, Rennen!
Yummy, Käse!
grab, grab!
versteckt!*/




fun main() {
    var maus = Maus()
    maus.vorMenschenWegRennen()
    maus.kaeseEssen()
    maus.tunnelGraben()
    maus.verstecken()

}