fun main() {
    /*Escreva um programa em que o usuário informe o seu nome e em seguida o
    programa perguntará a idade do usuário. Agora o programa deve exibir
    a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]"*/

    var nome = ""
    var idade = ""
    var resultado = ""

    print("Informe seu nome: ")
    nome = readLine()!!

    print("Informe sua idade: ")
    idade = readLine()!!

    print("Olá, $nome! Sua idade é $idade!")

}