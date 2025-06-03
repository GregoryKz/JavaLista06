package dev_klaus.lista06;

/*
 * Escreva um programa que solicite ao usuário um número de 1 a 12
 * e exiba o mês e a estação do ano correspondente.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio066_VerificacaoMesEstacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int numeroMes = scanner.nextInt();

        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Número inválido. Digite um número entre 1 e 12.");
            scanner.close();
            return;
        }

        String[] nomesMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        String nomeMes = nomesMeses[numeroMes - 1];
        String estacao = descobrirEstacao(numeroMes);

        System.out.println("Mês: " + nomeMes);
        System.out.println("Estação: " + estacao);

        scanner.close();
    }

    private static String descobrirEstacao(int mes) {
        return switch (mes) {
            case 12, 1, 2 -> "Verão";
            case 3, 4, 5 -> "Outono";
            case 6, 7, 8 -> "Inverno";
            case 9, 10, 11 -> "Primavera";
            default -> "Desconhecida";
        };
    }
}
