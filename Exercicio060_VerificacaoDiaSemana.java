package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário um número de 1 a 7 e exiba o dia da semana correspondente.
 * 1 = Domingo, 2 = Segunda, ..., 7 = Sábado.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio060_VerificacaoDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int numeroDia = scanner.hasNextInt() ? scanner.nextInt() : -1;

        String diaSemana = switch (numeroDia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Número inválido! Deve ser entre 1 e 7.";
        };

        System.out.println(diaSemana);
        scanner.close();
    }
}
