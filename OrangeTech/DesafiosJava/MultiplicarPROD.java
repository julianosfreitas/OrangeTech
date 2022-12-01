package DesafiosJava;

import java.util.Scanner;

public class MultiplicarPROD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o Valor A: ");
        A = scan.nextInt();
        System.out.println("Digite o Valor B: ");
        B = scan.nextInt();

        PROD = (A * B);
        System.out.println("PROD = " + PROD);

        scan.close();
    }
}
