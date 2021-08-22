package data

//Penerapan penggunaan Abstract Class dan Constructor
abstract class Game() {
    abstract var name: String
}

open class BlueTeam : Game() {
    override var name: String = ""
}

class BlueTeamPlayer(
    override var name: String = "",
) : BlueTeam() {
}

open class GreenTeam : Game() {
    override var name: String = ""
}

class GreenTeamPlayer(
    override var name: String = ""
) : GreenTeam() {

}


