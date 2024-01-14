package com.bia.estruturasdecontrole.exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            String nome = scanner.next();
            int N = scanner.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        scanner.close();
    }
}
