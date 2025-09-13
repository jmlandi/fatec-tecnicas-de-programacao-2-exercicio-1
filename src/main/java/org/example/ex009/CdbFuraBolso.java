package org.example.ex009;

public class CdbFuraBolso extends Investimento {
    public CdbFuraBolso(double selicAnual, double capitalInicial, int meses) {
        super("CDB Fura Bolso", selicAnual, capitalInicial, meses);
    }
    protected double taxaProduto(double selicMensal) { return selicMensal * 0.93; }
    protected double descontos(double capital, double rendimentoBruto) {
        return capital * 0.01 + rendimentoBruto * 0.06;
    }
}