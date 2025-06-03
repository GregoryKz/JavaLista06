package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário os comprimentos dos três lados de um triângulo
 * e classifique-o como equilátero, isósceles ou escaleno.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio065_VerificacaoTipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado 1 do triângulo: ");
        double lado1 = scanner.hasNextDouble() ? scanner.nextDouble() : -1;

        System.out.print("Digite o lado 2 do triângulo: ");
        double lado2 = scanner.hasNextDouble() ? scanner.nextDouble() : -1;

        System.out.print("Digite o lado 3 do triângulo: ");
        double lado3 = scanner.hasNextDouble() ? scanner.nextDouble() : -1;

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Lados inválidos. Devem ser maiores que zero.");
            scanner.close();
            return;
        }

        boolean formaTriangulo = (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);

        if (!formaTriangulo) {
            System.out.println("Os lados não formam um triângulo válido.");
        } else {
            String tipoTriangulo = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" :
                    (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) ? "Isósceles" : "Escaleno";
            System.out.println("O triângulo é do tipo: " + tipoTriangulo);
        }

        scanner.close();
    }
}
