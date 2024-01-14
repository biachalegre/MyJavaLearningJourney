package com.bia.estruturasdecontrole.exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String j1 = sc.nextLine().toLowerCase();
            String j2 = sc.nextLine().toLowerCase();

            determinarVencedor(j1, j2);
        }

        sc.close();
    }

    private static void determinarVencedor(String j1, String j2) {
        switch (j1) {
            case "ataque":
                switch (j2) {
                    case "pedra", "papel":
                        System.out.println("Jogador 1 venceu");
                        break;
                    case "ataque":
                        System.out.println("Aniquilacao mutua");
                        break;
                }
                break;
            case "pedra":
                switch (j2) {
                    case "pedra":
                        System.out.println("Sem ganhador");
                        break;
                    case "papel":
                        System.out.println("Jogador 1 venceu");
                        break;
                    case "ataque":
                        System.out.println("Jogador 2 venceu");
                        break;
                }
                break;
            case "papel":
                switch (j2) {
                    case "papel":
                        System.out.println("Ambos venceram");
                        break;
                    case "pedra", "ataque":
                        System.out.println("Jogador 2 venceu");
                        break;
                }
                break;
        }
    }
}
