fun main(){
    /*Slide 38: When

        //Exemplo 1
        val nota = 4
        var resultado = when {
            nota >=6 -> "Aprovado"
            nota < 4 -> "Reprovado"
            else -> "Recuperação"
        }
        println(resultado)

        //Exemplo 2
        val nota = 4f // ou 4.toFloat()
        var resultado = when (nota) {
            in 6f..10f -> "Aprovado"
            in 4f..6f -> "Recuperação"
            in 0f..4f -> "Reprovado"
            else -> "INVÁLIDA"
        }
        println(resultado)

        //Exemplo 3
        val estado = "RS"

        var resultado = when (estado) {
            "AC", "AM", "RR", "AP", "PA", "RO", "TO" -> "Norte"
            "SP", "MG", "ES", "RJ" -> "Sudeste"
            else -> "Outra"
        }
        println(resultado)

        Novo Exemplo: Verificando cores e atribuindo a algo que corresponde
    */
    val cor = "Azul"

    var resultado = when (cor) {
        "Vermelho", "Amarelo", "Verde" -> "Semafaro"
        "Preto", "Branco" -> "Corinthians"
        else -> "Outra"
    }
    println(resultado)

}