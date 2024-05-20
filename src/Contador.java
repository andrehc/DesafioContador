import Exceptions.InvalidParamsException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (InvalidParamsException exception) {
            exception.MinhaRuntimeExcecao();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws InvalidParamsException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw InvalidParamsException()
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

    }
}