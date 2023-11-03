fun main() {
    /*Slide 48: Classes
    //Exemplo 1
    val p1 = Pessoa()
    val p2 = Pessoa()
    val p3 = Pessoa()
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)

    class Pessoa {
        var nome = "Vazio"
        var peso = Of
        var altura = Of
    }

    //Exemplo 2
    val p1 = Pessoa()
    val p2 = Pessoa()
    val p3 = Pessoa()
    p1.nome = "Maria"
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)

    class Pessoa {
        var nome = "Vazio"
        var peso = Of
        var altura = Of
    }

    //Exemplo 3
    val p1 = Pessoa("Maria", 60f, 1.70f)
    val p2 = Pessoa("Joaquim", 70f, 1.75f)
    val p3 = Pessoa("Marcos", 80f, 1.80f)
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)

    class Pessoa(var nome: String, var peso: Float, var altura: Float)


    Novo Exemplo: Criando uma classe pessoa com atributos Nome, Idade e Sexo
*/
    val p1 = Pessoa("João", 18, "Masculino")
    val p2 = Pessoa("Lucas", 21, "Masculino")
    val p3 = Pessoa("Marcela", 25, "Feminino")
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)
}
class Pessoa(var nome: String, var idade: Int, var sexo: String)