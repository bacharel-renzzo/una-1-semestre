
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Programa que, dados três valores, imprime a média aritmética, harmônica e geométrica de tais.");

        System.out.println("Por favor, escreva o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Por favor, escreva o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Por favor, escreva o terceiro número: ");
        double num3 = scanner.nextDouble();

        double mediaM = (num1 + num2 + num3) / 3;
        double mediaH = 3 / (1 / num1) + (1 / num2) + (1 / num3);
        double mediaG = Math.cbrt(num1 * num2 * num3);

        System.out.println("O resultado da média aritmética dos três números é: " + mediaM);
        System.out.println("O resultado da média harmônica dos três números é: " + mediaH);
        System.out.println("O resultado da média geométrica dos três números é: " + mediaG);
        scanner.close();

    }

}
