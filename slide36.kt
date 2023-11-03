fun main(){
/*Slide 36: Expressões

    val nota = 4
    val resultado = if(nota >=6)
        "Aprovado"
    else if(nota <4)
        "Reprovado"
    else
        "Recuperação"
    println(resultado)

    Novo exemplo: Assimilando uma cor ao status da nota (aprov. - verde / rep. - vermelho / rec. - amarelo),
 */
    val nota = 6
    val resultado = if(nota >=6)
        "Verde"
    else if(nota <4)
        "Vermelho"
    else
        "Amarelo"
    println(resultado)
}