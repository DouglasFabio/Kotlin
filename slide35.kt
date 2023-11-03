fun main(){
/*Slide 35: Estruturas de decisão

    //Exemplo 1
    val nota = 4
    var resultado: String
    if (nota >=6){
        resultado = "Aprovado"
    }
    else if (nota < 4){
        resultado = "Reprovado"
    }
    else{
        resultado = "Recuperação"
    }
    println(resultado)

    //Exemplo 2
    val nota = 4
    var resultado: String
    if(nota>=6)
        resultado = "Aprovado"
    else if(nota<4)
        resultado = "Reprovado"
    else
        resultado = "Recuperação"
    println(resultado)

    //Exemplo 3
    val nota = 4
    if(nota>=6)
        println("Aprovado")
    else if(nota<4)
        println("Reprovado")
    else
        println("Recuperação")

    Novo Exemplo: Verificando possibilidade de nota de acordo com o status "aprovado", "reprovado" ou "rec"
*/
    var status = arrayOf("Aprovado", "Reprovado", "Rec")

    var nota1 = 9.7

    if(nota1 >=6)
        println("Notas de 6 a 10, situação: "+status[0])
    else if(nota1 <4)
        println("Notas de 0 a 4, situação: "+status[1])
    else
        println("Notas de 4 a 5.9, situação: "+status[2])

}