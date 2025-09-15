fun main() {
    /*Considerando a figura abaixo, escreva um programa para
    cada forma que calcule e exiba em tela cada uma de suas
    respectivas áreas. O usuário irá informar os valores de cada variável.*/

    var opcao = ""

    println("CALCULE ÁREA!")
    println("Digite o número correspondente a área da figura geométrica:")
    println("1- Retângulo")
    println("2- Quadrado")
    println("3- Losango")
    println("4- Trapézio")
    println("5- Paralelograma")
    println("6- Triângulo")
    println("7- Círculo")
    opcao = readLine()!!

    //RETANGULO
    if (opcao == "1"){
        //variaveis
        var base : Int
        var altura : Int
        var resultado : Int

        println("Digite a base:")
        base = readLine()!!.toInt()

        println("Digite a altura:")
        altura = readLine()!!.toInt()

        resultado = base * altura

        println("A área do seu retâgulo é $resultado")
    }
    //QUADRADO
    else if (opcao == "2"){
        //variaveis
        var ladoA : Int
        var ladoB : Int
        var resultado : Int

        println("Digite um lado:")
        ladoA = readLine()!!.toInt()

        println("Digite outro lado:")
        ladoB = readLine()!!.toInt()

        resultado = ladoA * ladoB

        println("A área do seu quadrado é $resultado ²")
    }
    //LOSANGO
    else if (opcao == "3"){
        //variaveis
        var diagonalM : Int
        var diagonalm : Int
        var resultado : Int

        print("Digite a diagonal Maior:")
        diagonalM = readLine()!!.toInt()

        print("Digite a diagonal menor:")
        diagonalm = readLine()!!.toInt()

        resultado = diagonalM * diagonalm / 2

        println("A área do seu losango é $resultado")
    }
    //TRAPEZIO
    else if (opcao == "4"){
        //variaveis
        var baseM : Int
        var basem : Int
        var altura : Int
        var resultado : Int

        print("Digite a base maior:")
        baseM = readLine()!!.toInt()

        print("Digite a base menor:")
        basem = readLine()!!.toInt()

        print("Digite a altura:")
        altura = readLine()!!.toInt()

        resultado = baseM + basem * altura / 2

        println("A área do seu trapézio é $resultado")
    }
    //PARALELOGRAMA
    else if (opcao == "5"){
        //variavies
        var base : Int
        var altura : Int
        var resultado : Int

        print("Digite a base:")
        base = readLine()!!.toInt()

        print("Digite a altura:")
        altura = readLine()!!.toInt()

        resultado = base * altura

        println("A área do seu paralelograma é $resultado")
    }
    //TRIANGULO
    else if (opcao == "6"){
        //variaveis
        var base : Int
        var altura : Int
        var resultado : Int

        print("Digite a base:")
        base = readLine()!!.toInt()

        print("Digite a altura:")
        altura = readLine()!!.toInt()

        resultado = base * altura / 2

        println("A área do seu triângulo é $resultado")
    }
    //CIRCULO
    else if (opcao == "7"){
        var raio : Double
        var resultado : Double
        val pi = 3.14

        print("Digite a raio:")
        raio = readLine()!!.toDouble()

        resultado = (pi * (raio * raio))

        print("A área do seu circulo é $resultado")
    }
    //ERROR
    else{
        println("Número inválido! Tente novamente mais tarde!")
    }

}