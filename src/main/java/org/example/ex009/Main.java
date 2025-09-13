package org.example.ex009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Taxa Selic ANUAL (%): ");
        double selicPct = Double.parseDouble(in.next().replace(",", "."));
        System.out.print("Capital inicial: ");
        double capital = Double.parseDouble(in.next().replace(",", "."));

        double selicAnual = selicPct / 100.0;
        int meses = 12;

        Investimento a = new CdbBancoPagueMais(selicAnual, capital, meses);
        Investimento b = new CdbFuraBolso(selicAnual, capital, meses);

        double finalA = a.simularEImprimir();
        double finalB = b.simularEImprimir();

        System.out.println();
        System.out.println(finalA > finalB ? "Mais vantajoso: CDB Banco Pague Mais"
                : finalB > finalA ? "Mais vantajoso: CDB Fura Bolso"
                : "Empate.");
    }
}

