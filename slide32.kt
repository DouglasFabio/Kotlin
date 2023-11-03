fun main(){
/*Slide 32: Realizando substituição de caracteres em strings utilizando a função replace.
    val myText = "Hello"
    println(myText)
    val newText = myText.replace("lo", "p")
    println(newText)

    Novo Exemplo: Transformando a palavra "Namorada" em "amor" utilizando a função replace.
     */
    val palavra = "Namorada"
    println(palavra)
    val novaPalavra = palavra.replace("N", "")
    val novaPalavra2 = novaPalavra.replace("ada", "")
    println(novaPalavra2)
}