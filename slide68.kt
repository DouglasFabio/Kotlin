fun main(){
    /*
    Slide 68: Smart cast

    var a: Any = '1'
    var resultado = when (a) {
        is String -> "$a é um texto"
        is Int -> "$a é um número inteiro"
        else -> "não sei"
    }
    println(resultado)
    println(a::class.simpleName) // mostra o tipo da variável

    Novo exemplo: Mesmo exemplo utilizando valores diferentes na verificação (resultado será CHAR por conta da variavel a armazenar aspas simples
     */

    var a: Any = '8'
    var resultado = when (a) {
        is String -> "$a é um texto"
        is Int -> "$a é um número inteiro"
        else -> "não sei"
    }
    println(resultado)
    println(a::class.simpleName) // mostra o tipo da variável
}