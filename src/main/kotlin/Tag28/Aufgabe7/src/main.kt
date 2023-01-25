fun main() {
    val vogel = Vogel33(12.0,)
    val pinguin = Pinguin(30.0)
    val adler = Adler(50.0)

    println("Tag28.Pinguin kann ${pinguin.canFly} Fliegen")
    pinguin.waddle()
    println("Tag28.Adler kann ${adler.canFly} Fliegen")
    adler.fly()
    pinguin.makeNoise()
}