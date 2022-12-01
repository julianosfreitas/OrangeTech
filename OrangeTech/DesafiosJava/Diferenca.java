package DesafiosJava;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 4 números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int DIF = (a - b - c - d);
        System.out.println("A Subtração dos números é igual a: " + DIF);

        scan.close();
    }
}
