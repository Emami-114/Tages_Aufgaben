class Vogel {

    var vogelType: String
    var futtertypen: String
    var age: Int = 0

    constructor(vogelType: String, futtertypen: String, age: Int):this(vogelType,futtertypen) {
      this.age=age
    }

    constructor(vogelType: String, futtertypen: String) {
        this.vogelType = vogelType
        this.futtertypen = futtertypen
    }


    fun zwitschern() {
        println("zwitscher")
    }
}