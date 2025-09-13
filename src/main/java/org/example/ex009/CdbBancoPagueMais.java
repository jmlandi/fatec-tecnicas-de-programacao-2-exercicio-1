package org.example.ex009;

public class CdbBancoPagueMais extends Investimento {
    public CdbBancoPagueMais(double selicAnual, double capitalInicial, int meses) {
        super("CDB Banco Pague Mais", selicAnual, capitalInicial, meses);
    }
    protected double taxaProduto(double selicMensal) { return selicMensal * 0.85; }
    protected double descontos(double capital, double rendimentoBruto) { return rendimentoBruto * 0.10; }
}
