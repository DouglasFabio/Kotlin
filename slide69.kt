fun main(){
    /*
    Slide 69: Exceções - trabalhando com Try / Catch / Throws e Finally para exceções.

    var r: Any = "s"
    var t = Of
    do{
        print("Digite um número inteiro ou 's' para sair: ")
        try{
            r = readLine()!!
            if(r == "s")
                break
            t += r.toInt()
        }
        catch(e: Exception){
            println("    !!!!Houve uma exceção!!!")
        }
        finally{
            println("   total parcial: $t")
        }
    }while(r!= "s")


    // Novo exemplo: Testes com a palavra sair ao invés da tecla S
     */
    var r: Any = "sair"
    var t = 0f
    do{
        print("Digite um número inteiro ou 'sair' para fechar: ")
        try{
            r = readLine()!!
            if(r == "sair")
                break
            t += r.toInt()
        }
        catch(e: Exception){
            println("    !!!!Houve uma exceção!!!")
        }
        finally{
            println("   total parcial: $t")
        }
    }while(r!= "s")
}