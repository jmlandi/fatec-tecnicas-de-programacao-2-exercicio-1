package org.example.ex009;

public abstract class Investimento {
    protected final String nome;
    protected final double selicAnual;
    protected final double capitalInicial;
    protected final int meses;

    public Investimento(String nome, double selicAnual, double capitalInicial, int meses) {
        this.nome = nome;
        this.selicAnual = selicAnual;
        this.capitalInicial = capitalInicial;
        this.meses = meses;
    }

    protected double taxaSelicMensal() { return Math.pow(1 + selicAnual, 1.0/12) - 1; }

    protected abstract double taxaProduto(double selicMensal);
    protected abstract double descontos(double capital, double rendimentoBruto);

    public double simularEImprimir() {
        double capital = capitalInicial, selicM = taxaSelicMensal();
        double brutoTot = 0, descTot = 0, liqTot = 0;

        System.out.println("\n== " + nome + " ==");
        System.out.printf("Taxa Selic (a.a.): %.2f%%%n", selicAnual * 100);
        System.out.printf("Capital investido: %.2f%n%n", capitalInicial);
        System.out.printf("%-3s %-12s %-12s %-12s %-12s%n", "Mês", "Capital", "Rendimento", "Descontos", "Total");

        for (int mes = 1; mes <= meses; mes++) {
            double taxa = taxaProduto(selicM);
            double bruto = capital * taxa;
            double desc = descontos(capital, bruto);
            double liq  = bruto - desc;
            double antes = capital;
            capital += liq;

            System.out.printf("%-3d %-12.2f %-12.2f %-12.2f %-12.2f%n",
                    mes, antes, bruto, desc, capital);

            brutoTot += bruto; descTot += desc; liqTot += liq;
        }

        System.out.printf("%nRendimento Total:   %.2f%n", brutoTot);
        System.out.printf("Descontos:           %.2f%n", descTot);
        System.out.printf("Rendimento Líquido:  %.2f%n", liqTot);
        System.out.printf("Capital Final:       %.2f%n", capital);
        return capital;
    }
}

