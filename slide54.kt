fun main() {
    /*Slide 54: Imprimindo objetos

    //Exemplo 1
    val p1 = PessoaObj("Maria", 60f, 1.70f)
    val p2 = PessoaObj("Joaquim", 70f, 1.75f)
    val p3 = PessoaObj("Marcos", 80f, 1.80f)
    println(p1)
    println(p2)
    println(p3.toString())

    class PessoaObj(var nome: String, var peso: Float, var altura: Float)

    //Exemplo 2
    val p1 = PessoaObj("Maria", 60f, 1.70f)
    val p2 = PessoaObj("Joaquim", 70f, 1.75f)
    val p3 = PessoaObj("Marcos", 80f, 1.80f)
    println(p1)
    println(p2)
    println(p3.toString())

    class PessoaObj(var nome: String, var peso: Float, var altura: Float){
        override fun toString(): String{
            return "$nome, $peso, $altura"
        }
    }


    Novo Exemplo: Mesmo exemplo alterando valores
*/
    val p1 = PessoaObj("Maria Fernanda", 65f, 1.75f)
    val p2 = PessoaObj("João", 75f, 1.80f)
    val p3 = PessoaObj("Mauricio", 85f, 1.85f)
    println(p1)
    println(p2)
    println(p3.toString())
}
    class PessoaObj(var nome: String, var peso: Float, var altura: Float)