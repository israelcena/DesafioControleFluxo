package desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        int num1 = terminal.nextInt();
        System.out.println("Digite o segundo número ");
        int num2 = terminal.nextInt();

        try {
            contar(num1, num2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parametro um é maior que o parametro dois");
        }

    }

    static void contar (int num1, int num2) throws ParametrosInvalidosException {

        if (num1 > num2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = num2 - num1;

        for (int i = 0; i < contagem; i++) {
            System.out.println(i);
        }

    }
}
