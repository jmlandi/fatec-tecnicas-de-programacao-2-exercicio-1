package org.example.ex008;

public class Main {

    public static void main(String[] args) {
        int[] X = {2, 7, 4, 3, 2};
        int[] Y = {1, 2, 3, 6, 5};

        int n = X.length;

        // a)
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += X[i];
        }

        // b)
        int b = 0;
        for (int i = 0; i < n; i++) {
            b += X[i] * Y[i];
        }

        // c)
        int parte1 = 0;
        for (int i = 1; i <= 3; i++) {
            parte1 += X[i] * Y[i] * Y[i];
        }
        int parte2 = 3 * n;
        int c = parte1 + parte2;

        System.out.println("a) " + a); // 18
        System.out.println("b) " + b); // 56
        System.out.println("c) " + c); // 187
    }

}
