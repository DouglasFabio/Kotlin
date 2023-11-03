/*
Slide 67: Cast

fun main(){
    val a = "1"
    println(a+1)
    println(a.toInt()+1)
    println(a.toFloat()+1)
    println((a.toDouble()+1).toString())
    println((a.toDouble()+1).toString()+1)
}

Novo exemplo: Mesmo exemplo de cast anterior (concatenação de variável que armazena uma string com o número 1 e a soma de fato do número
 */

fun main(){
    val a = "1"
    println(a+5)
    println(a.toInt()+5)
    println(a.toFloat()+5)
    println((a.toDouble()+5).toString())
    println((a.toDouble()+5).toString()+5)
}