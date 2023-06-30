
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula o valor de um produto com o valor de 10% acrescido a ele: ");

        System.out.println("Informe o valor do produto: ");
        double numeroUm = scanner.nextDouble();

        double porcentagem = numeroUm * 10 / 100;

        System.out.println("O valor do produto acrescido o valor de 10% é: " + (numeroUm + porcentagem));
        scanner.close();

    }
}
