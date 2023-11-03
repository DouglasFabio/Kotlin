fun main() {
    /*Slide 49: Métodos

    val p1 = Pessoa("Maria", 60f, 1.70f)
    val p2 = Pessoa("Maria", 70f, 1.75f)
    val p3 = Pessoa("Maria", 80f, 1.80f)
    println("${p1.nome} tem IMC = ${p1.imc()}")
    println("${p2.nome} tem IMC = ${p2.imc()}")
    println("${p3.nome} tem IMC = ${p3.imc()}")

    class Pessoa(var nome: String, var peso: Float, var altura: Float){
        fun imc() = peso / (altura * altura)
    }


    Novo Exemplo: Atribuindo a classificação do IMC de acordo com seu valor
*/
    val p1 = PessoaNova("Maria", 40f, 1.70f)
    val p2 = PessoaNova("Maria", 70f, 1.75f)
    val p3 = PessoaNova("Maria", 120f, 1.80f)
    var classificaIMCp1 = "Vazio"
    var classificaIMCp2 = "Vazio"
    var classificaIMCp3 = "Vazio"
    if(p1.imc() < 18.5)
        classificaIMCp1 = "Abaixo do peso"
    else if(p1.imc() > 30)
        classificaIMCp1 = "Obesidade"
    else if(p1.imc() >= 18.5 && p1.imc() <= 25)
        classificaIMCp1 = "Peso Normal"

    if(p2.imc() < 18.5)
        classificaIMCp2 = "Abaixo do peso"
    else if(p2.imc() > 30)
        classificaIMCp2 = "Obesidade"
    else if(p2.imc() >= 18.5 && p2.imc() <= 25)
        classificaIMCp2 = "Peso Normal"

    if(p3.imc() < 18.5)
        classificaIMCp3 = "Abaixo do peso"
    else if(p3.imc() > 30)
        classificaIMCp3 = "Obesidade"
    else if(p3.imc() >= 18.5 && p3.imc() <= 25)
        classificaIMCp3 = "Peso Normal"
    println("${p1.nome} tem IMC = ${p1.imc()}, considerado: $classificaIMCp1")
    println("${p2.nome} tem IMC = ${p2.imc()}, considerado: $classificaIMCp2")
    println("${p3.nome} tem IMC = ${p3.imc()}, considerado: $classificaIMCp3")
}
    class PessoaNova(var nome: String, var peso: Float, var altura: Float){
        fun imc() = peso / (altura * altura)
    }