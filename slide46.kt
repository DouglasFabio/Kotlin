fun main() {
    /*Slide 46: Funções
    //Exemplo 1
    mensagem()

    fun mensagem(){
        println("Feliz Natal!")
    }

    //Exemplo 2
    mensagem(1)
    mensagem(1)
    mensagem(2)

    fun mensagem(n: Int){
        if(n == 1)
            println("Feliz Natal!")
        else
            println("Feliz aniversário!")
    }

     Novo Exemplo: Imprimindo Feliz Páscoa e Feliz Ano novo seguindo a construção de funções do exemplo 2
*/
    mensagem(1)
    mensagem(2)
    mensagem(3)
}
fun mensagem(n: Int){
    if(n == 1)
        println("Feliz Páscoa!")
    else
        println("Feliz Ano Novo!")
}
