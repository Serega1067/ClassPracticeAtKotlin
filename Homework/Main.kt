sealed interface Command {
}

data class Person(
    val name: String = "", 
    val phone: String = "", 
    val email: String == ""
    ) {
}

fun main() {
    readCommand()
}
