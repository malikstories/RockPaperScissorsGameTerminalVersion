package app

import data.BlueTeamPlayer
import data.GreenTeamPlayer
import data.Human

fun main(args: Array<String>) {
    star()
}

private fun star(){
    println("""
            =====================================
                     WELCOME TO THE GAME
                    Rock, Paper, Scissors
            -------------------------------------
                   Blue Team VS Green Team
            -------------------------------------
        """.trimIndent())
    print("Many rounds (1/2/3....): ")
    var counterRound = 1
    val manyRounds = readLine()?.toInt()!!
    println("-------------------------------------")

    println("Enter blue team player name : ")
    //Penerapan penggunaan Object dan parameter constuctor
    val player1 = BlueTeamPlayer(readLine()!!.uppercase())
    println("Enter green team player name : ")
    //Penerapan penggunaan Object dan parameter constuctor
    val player2 = GreenTeamPlayer(readLine()!!.uppercase())

    while (counterRound <= manyRounds) {
        playGame(player1.name, player2.name, counterRound)
        counterRound++
    }
    val human = Human(player1.name, player2.name)
    human.closing()

}

fun playGame(player1: String, player2: String, round: Int){
    println("""
        =====================================
            Let's start playing the game!
               (Rock, Paper, Scissors)
        -------------------------------------
                     ROUND $round
        -------------------------------------
    """.trimIndent())
    var player1Choice: String = ""
    var player2Choice: String = ""
    do {
        print(" Hello $player1, Please enter your choice\n (scissors / rock / paper) = ")
        var player1 = readLine()!!.uppercase()
        -------------------------------------
        player1Choice = player1
    }while (player1 != "PAPER" && player1 != "ROCK" && player1 != "SCISSORS")

    do {
        print(" Hello $player2, Please enter your choice\n (scissors / rock / paper) = ")
        var player2 = readLine()!!.uppercase()
        -------------------------------------
        player2Choice = player2
    }while (player2 != "PAPER" && player2 != "ROCK" && player2 != "SCISSORS")


    if (player1Choice == "SCISSORS"){
        when(player2Choice){
            "ROCK" -> {
                println("""
                    -------------------------------------
                    Wow, $player2 you win!
                    =====================================
                """.trimIndent())
            }
            "SCISSORS" -> {
                println("""
                    -------------------------------------
                    DRAW!
                    =====================================
                """.trimIndent())
            }
            "PAPER" -> {
                println("""
                    -------------------------------------
                    Wow, $player1 you win!
                    =====================================
                """.trimIndent())
            }
        }
    } else if (player1Choice == "ROCK") {
        when(player2Choice){
            "SCISSORS" -> {
                println("""
                    -------------------------------------
                    Wow, $player1 you win!
                    =====================================
                """.trimIndent())
            }
            "ROCK" -> {
                println("""
                    -------------------------------------
                    DRAW!
                    =====================================
                """.trimIndent())
            }
            "PAPER" -> {
                println("""
                    -------------------------------------
                    Wow, $player2 you win!
                    =====================================
                """.trimIndent())
            }
        }
    } else if (player1Choice == "PAPER") {
        when(player2Choice){
            "SCISSORS" -> {
                println("""
                    -------------------------------------
                    Wow, $player2 you win!
                    =====================================
                """.trimIndent())
            }
            "PAPER" -> {
                println("""
                    -------------------------------------
                    DRAW!
                    =====================================
                """.trimIndent())
            }
            "ROCK" -> {
                println("""
                    -------------------------------------
                    Wow, $player1 you win!
                    =====================================
                """.trimIndent())
            }
        }
    }

}
