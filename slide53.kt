fun main() {
    /*Slide 53: Herança

    val p1 = Pessoa("Maria", 60f, 1.70f)
    val p2 = Colaborador(2000f, "Maria", 70f, 1.75f)
    val p3 = Cliente(1500f, "Maria", 80f, 1.80f)
    println("${p1.nome} tem IMC = ${p1.imc()}")
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if(p2.ativo) "está ativo" else "foi despedido"}")
    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")

    open class Pessoa(var nome: String, var peso: Float, var altura: Float){
        fun imc() = peso / (altura * altura)
    }

    class Cliente(var renda: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura){
        fun aprovacao() = renda > 1000
    }

    class Colaborador(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura){
        val ativo = true
        fun bonus() = salario > 0
    }


    Novo Exemplo: Mesmo exemplo alterando valores
*/
    val p1 = Alguem("Bruna", 50f, 1.78f)
    val p2 = Colaborador(5000f, "Vitória", 60f, 1.55f)
    val p3 = Cliente(2500f, "Nathalia", 70f, 1.80f)
    println("${p1.nome} tem IMC = ${p1.imc()}")
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.ativo) "está ativo" else "foi despedido"}")
    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
}
    open class Alguem(var nome: String, var peso: Float, var altura: Float){
        fun imc() = peso / (altura * altura)
    }

    class Cliente(var renda: Float, nome: String, peso: Float, altura: Float): Alguem(nome, peso, altura){
        fun aprovacao() = renda > 1000
    }

    class Colaborador(var salario: Float, nome: String, peso: Float, altura: Float): Alguem(nome, peso, altura){
        val ativo = true
        fun bonus() = salario > 0
    }