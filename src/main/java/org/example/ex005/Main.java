package org.example.ex005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para descobrir se é primo ou não: ");
        int numberToCheck = scanner.nextInt();
        int numberOfDivisions = 0;

        for (int i = 1; i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) numberOfDivisions++;
        }

        if (numberOfDivisions > 2 || numberOfDivisions == 1) {
            System.out.println("O número não é primo.");
        } else {
            System.out.println("O número é primo.");
        }

    }

}
