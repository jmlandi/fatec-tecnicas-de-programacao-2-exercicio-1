package org.example.ex001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de valores a serem lidos: ");
        int loopValue = scanner.nextInt();
        int negativeNumbersCount = 0;

        for (int i = 0; i < loopValue; i++) {
            System.out.printf("    [%d] Digite um número inteiro, negativo ou positivo: ", i+1);
            int numberToValidate = scanner.nextInt();
            if (numberToValidate < 0) negativeNumbersCount++;
        }

        System.out.println("O total de números negativos é: " + negativeNumbersCount);

    }

}
