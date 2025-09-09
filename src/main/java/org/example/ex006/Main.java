package org.example.ex006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um salário para o cálculo do desconto de INSS: ");
        double salary = scanner.nextDouble();
        double aliquot;
        double deduction;
        double inssDeduction;

        if (salary < 1212.00) {
            aliquot = 0.075;
            deduction = 0.0;
            inssDeduction = (salary * aliquot) - deduction;
            System.out.println("Salário Bruto: " + salary);
            System.out.println("Alíquota INSS: " + (aliquot * 100) + "%");
            System.out.println("Dedução INSS: " + inssDeduction);
            System.out.println("Salário Líquido: " + (salary - inssDeduction));
        } else if (salary < 2427.35) {
            aliquot = 0.09;
            deduction = 18.18;
            inssDeduction = (salary * aliquot) - deduction;
            System.out.println("Salário Bruto: " + salary);
            System.out.println("Alíquota INSS: " + (aliquot * 100) + "%");
            System.out.println("Dedução INSS: " + inssDeduction);
            System.out.println("Salário Líquido: " + (salary - inssDeduction));
        } else if (salary < 3641.03) {
            aliquot = 0.12;
            deduction = 91.0;
            inssDeduction = (salary * aliquot) - deduction;
            System.out.println("Salário Bruto: " + salary);
            System.out.println("Alíquota INSS: " + (aliquot * 100) + "%");
            System.out.println("Dedução INSS: " + inssDeduction);
            System.out.println("Salário Líquido: " + (salary - inssDeduction));
        } else if (salary < 7087.22) {
            aliquot = 0.14;
            deduction = 163.82;
            inssDeduction = (salary * aliquot) - deduction;
            System.out.println("Salário Bruto: " + salary);
            System.out.println("Alíquota INSS: " + (aliquot * 100) + "%");
            System.out.println("Dedução INSS: " + inssDeduction);
            System.out.println("Salário Líquido: " + (salary - inssDeduction));
        }

    }


}
