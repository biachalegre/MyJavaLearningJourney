package com.bia.estruturasdecontrole.exercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um array de String, chamado "nomes", que armazena os 10 dados
        // que serão fornecidos pelo usuário
        String[] nomes = new String[10];

        // Loop responsável por iterar 10 vezes, pedindo para o usuário inserir
        // um nome e armazenando cada um desses nomes no array nomes.
        // O primeiro nome fornecido é armazenado no índice 0 e o décimo número, no indíce 9.
        for (int i = 0; i < 10; i++) {
            String nome = scanner.nextLine();
            nomes[i] = nome;
        }

        // Imprime os nomes de acordo com o índice específicado
        System.out.println(nomes[2]); // Imprime o terceiro nome
        System.out.println(nomes[6]); // Imprime o sétimo nome
        System.out.println(nomes[8]); // Imprime o nono nome

        scanner.close();
    }
}
