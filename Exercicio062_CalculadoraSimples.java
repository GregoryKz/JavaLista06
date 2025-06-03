package dev_klaus.lista06;

/*
 * Faça um programa que solicite ao usuário dois números e uma operação
 * (adição, subtração, multiplicação, divisão) e exiba o resultado.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio062_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.hasNextDouble() ? scanner.nextDouble() : Double.NaN;

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.hasNextDouble() ? scanner.nextDouble() : Double.NaN;

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        if (Double.isNaN(primeiroNumero) || Double.isNaN(segundoNumero)) {
            System.out.println("Entrada inválida para números.");
        } else {
            double resultado;
            switch (operacao) {
                case "+" -> resultado = primeiroNumero + segundoNumero;
                case "-" -> resultado = primeiroNumero - segundoNumero;
                case "*" -> resultado = primeiroNumero * segundoNumero;
                case "/" -> {
                    if (segundoNumero == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        scanner.close();
                        return;
                    } else {
                        resultado = primeiroNumero / segundoNumero;
                    }
                }
                default -> {
                    System.out.println("Operação inválida!");
                    scanner.close();
                    return;
                }
            }
            System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", primeiroNumero, operacao, segundoNumero, resultado);
        }

        scanner.close();
    }
}
