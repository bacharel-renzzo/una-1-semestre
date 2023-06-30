
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula a média aritmética de dois números.");

        System.out.println("Informe o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");

        double numeroDois = scanner.nextDouble();
        double media = (numeroUm + numeroDois) / 2;

        System.out.println("O resultado da média aritmética dos dois números é: " + media);
        scanner.close();

    }

}
