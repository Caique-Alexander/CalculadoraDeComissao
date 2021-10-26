fun main(args: Array<String>) {

   var vendas = 0
    var x = 0
    var comissao = 0.0

    print("Digite o valor de vendas: ")
    vendas = readLine()!!.toInt()

    if(vendas > 10000){
        x = 30
        comissao = vendas.toDouble() * x / 100
        println("Você receberá R$ $comissao de comissão")
    }else if(vendas >= 5001 && vendas <= 9999){
        x = 20
        comissao = vendas.toDouble() * x / 100
        println("Você receberá R$ $comissao de comissão")
    }else if(vendas >= 1001 && vendas <= 4999) {
        x = 10
        comissao = vendas.toDouble() * x / 100
        println("Você receberá R$ $comissao de comissão")
    }else if(vendas < 1000){
        println("N / D")
    }else{
        println("Você está fazendo isso errado!")
    }

}
