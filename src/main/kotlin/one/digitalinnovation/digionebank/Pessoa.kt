package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-21"

}

fun main() {
    val jether = Pessoa()

    print(jether.nome)
    print(jether.cpf)
}