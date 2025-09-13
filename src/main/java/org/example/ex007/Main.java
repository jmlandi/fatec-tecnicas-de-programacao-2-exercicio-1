package org.example.ex007;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.nome = "Marcos";
        a1.p1 = 7.5;
        a1.p2 = 10.0;
        System.out.println("\n\nNome aluno 1: " + a1.nome);
        System.out.println("Prova 1 aluno 1: " + a1.p1);
        System.out.println("Prova 2 aluno 1: " + a1.p2);

        Aluno a2 = a1;
        a2.nome = "Marcos Landi";
        a2.p1 = 8.5;
        a2.p2 = 0.0;
        System.out.println("\n\nNome aluno 2: " + a1.nome);
        System.out.println("Prova 1 aluno 2: " + a1.p1);
        System.out.println("Prova 2 aluno 2: " + a1.p2);

        System.out.println("\n\nNome aluno 1: " + a1.nome);
        System.out.println("Prova 1 aluno 1: " + a1.p1);
        System.out.println("Prova 2 aluno 1: " + a1.p2);

    }

}
