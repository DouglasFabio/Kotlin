fun main() {
    /*Slide 43: Break e Continue
        //Exemplo 1
        var i = 0
        while(true){
            if(i>=10)
                break
            print("$i,")
            i++
        }

        //Exemplo 2
        var i = 0
        while(i <10){
            i++
            if(i == 4)
                break
            print("$i,")
        }

        //Exemplo 3
        var i = 0
        while(i <10){
            i++
            if(i == 4)
                continue
            print("$i,")
        }

        Novo Exemplo: Pulando o número 18 em uma lista de 0 a 20
    */
    var i = 0
    while(i <20){
        i++
        if(i == 18)
            continue
        print("$i,")
    }
}