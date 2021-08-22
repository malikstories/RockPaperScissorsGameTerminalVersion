package data

interface Interaction {
    val player1: String
    val player2: String
    fun closing()
}

class Human(override val player1: String, override val player2: String): Interaction{
        override fun closing() {
        println("""
            Hi, ${this.player1} and ${this.player2}
            Thank You For Playing
        """.trimIndent())
    }
}