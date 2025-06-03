package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário um número de 1 a 12 e exiba o mês do ano correspondente.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio061_VerificacaoMesAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 12 para o mês do ano: ");
        int numeroMes = scanner.hasNextInt() ? scanner.nextInt() : -1;

        String mesAno = switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Número inválido! Deve ser entre 1 e 12.";
        };

        System.out.println(mesAno);
        scanner.close();
    }
}
