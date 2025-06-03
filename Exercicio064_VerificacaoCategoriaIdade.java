package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário sua idade e exiba a categoria correspondente:
 * Criança (0-12), Adolescente (13-17), Adulto (18-59), Idoso (60+).
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio064_VerificacaoCategoriaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.hasNextInt() ? scanner.nextInt() : -1;

        String categoria = (idade < 0) ? "Idade inválida!" :
                (idade <= 12) ? "Criança" :
                        (idade <= 17) ? "Adolescente" :
                                (idade <= 59) ? "Adulto" : "Idoso";

        System.out.println("Categoria: " + categoria);
        scanner.close();
    }
}
