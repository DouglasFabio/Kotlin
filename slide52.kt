fun main() {
    /*Slide 52: Assessores Customizados

    val p1 = Pessoa("Maria", 60f, 1.70f)
    val p2 = Pessoa("Maria", 70f, 1.75f)
    val p3 = Pessoa("Maria", 80f, 1.80f)
    println("${p1.nome} tem IMC = ${p1.imc}")
    println("${p2.nome} tem IMC = ${p2.imc}")
    println("${p3.nome} tem IMC = ${p3.imc}")

    class Pessoa(var nome: String, var peso: Float, var altura: Float){
        //fun imc() = peso / (altura * altura)
        val imc get() = peso / (altura * altura)
    }


    Novo Exemplo: Mesmo exemplo alterando valores
*/
    val p1 = Pessoas("Leticia", 50f, 1.70f)
    val p2 = Pessoas("Marcos", 60f, 1.75f)
    val p3 = Pessoas("Roberta", 70f, 1.80f)
    println("${p1.nome} tem IMC = ${p1.imc}")
    println("${p2.nome} tem IMC = ${p2.imc}")
    println("${p3.nome} tem IMC = ${p3.imc}")
}
    class Pessoas(var nome: String, var peso: Float, var altura: Float){
        //fun imc() = peso / (altura * altura)
        val imc get() = peso / (altura * altura)
    }