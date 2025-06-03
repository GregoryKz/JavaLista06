package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário um número de 1 a 4 e exiba a estação do ano correspondente.
 * 1 = Primavera, 2 = Verão, 3 = Outono, 4 = Inverno.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio063_VerificacaoEstacaoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4 para a estação do ano: ");
        int numeroEstacao = scanner.hasNextInt() ? scanner.nextInt() : -1;

        String estacao = switch (numeroEstacao) {
            case 1 -> "Primavera";
            case 2 -> "Verão";
            case 3 -> "Outono";
            case 4 -> "Inverno";
            default -> "Número inválido! Deve ser entre 1 e 4.";
        };

        System.out.println(estacao);
        scanner.close();
    }
}
