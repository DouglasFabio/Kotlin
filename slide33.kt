fun main(){
/*Slide 33: Concatenação e Interpolação
    val myText = "Hello"
    val newText1 = myText + " " + myText
    val newText2 = "$myText $myText"
    println(myText)
    println(newText1)
    println(newText2)

    Obs: o newText2 é impresso duas vezes no exemplo, porém foi corrigido para imprimir as 2 strings.

    Novo Exemplo: Concatenando a palavra Tecnologia que está dividida
     */
    val palavra1 = "Tecno"
    val palavra2 = "logia"
    val palavraFinal = palavra1 + palavra2
    val palavraFinal2 = "$palavra1$palavra2"
    println(palavra1)
    println(palavra2)
    println(palavraFinal)
    println(palavraFinal2)
}