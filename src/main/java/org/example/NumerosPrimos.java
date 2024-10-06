package org.example;

import java.util.Scanner;

// O objetivo desse exercício é praticar as bases de desenvolvimento em Java.
// Para isso, crie uma classe Java e um apalicação que valide no console se um número é "Primo" ou não.

public class NumerosPrimos {
    // Cria uma classe principal para receber as lógicas.

    public static boolean ehPrimo(int numero){
    // Cria um Métodos Java "Static", ou seja que retornar algo.
    // O Método é do tipo "Bollean" e por isso o seu retorno deve ser do tipo "Boolean".
    // O Método recebe um valor que deve ser do tipo "int" que vair usada nas validações.

        if(numero < 1)
            return  false;
        //Verifica se o npumero é menor (<) que 1 e retorna false se for verdade.

        for(int i = 2; i <= Math.sqrt(numero); i ++){
        // Executa um laço de repetição do tipo FOR.
        // Cria uma váriavel "int" i e atribui 2 para ela.
        // "Math.sqrt" verifica a raiz quadrada do número passado no parâmetro e verifica se o resultado dele é menor que i
        // "i++" soma +1 para i
            if(i == 0 )
                return false;
            // Verifica se i é igual a 0 e retorna false se for true
        }
        return true;
        // Se nenhuma das condições dos "ifs" forem verdadeiras, vai retornar true.
    };

    public static void main(String[] args){
    // Cria uma função main para executar a aplicação, toda aplicação Java deve ter uma função main
    // Essa função é do tipo static e void, portanto ela não tem nenhum retorno só executa algo.
    // String[] args significa que pode conter um array de argumentos passados para o programa em linha de comando (não usamos nesse exemplo).
        Scanner scanner = new Scanner(System.in);
        // Aqui criamos um obejto do tipo scanner que é usado para caputurar a entrada do usuário.
        // System.in significa que a entrada será por linha de comando.
        // "scanner" é o nome escolhido para o objeto "Scanner" que será usado no restante do código.
        System.out.println("Digitar o número: ");
        // "System.out.println" imprime a mensagem escrita no parâmetro no console.

        int numero = scanner.nextInt();
        // Cria uma váriavel do tipo inteiro.
        // Usa o objeto "scanner" para pegar o próximo valor inteiro digitado no console.

        if(ehPrimo(numero)){
        // Faz uma validação if buscando o resultado do método ehPrimo e se retornar verdadeiro retorna a mensagem abaixo.
            System.out.println("Esse número: " + numero + " é primo");
            // Exibe a mensagem se o valor do if for verdadeiro concatenando com número.
        }else {
            // Qualquer outro retorno diferente de verdadeiro no if acima retorna a mensagem abaixo.
            System.out.println("Esse número: " + numero + " não é primo");
            // Exibe a mensagem se o valor do if for verdadeiro concatenando com número.
        }


    }
}
