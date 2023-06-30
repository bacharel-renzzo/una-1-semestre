
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que converte temperatura em graus Fahrenhait para graus centígrados");

        System.out.println("Informe a temperatura em graus Fahrenhait: ");
        double fahrenhait = scanner.nextDouble();

        double centigrados = (fahrenhait - 32) / 1.8;

        System.out.println("A temperatura em graus centígrados é: " + centigrados);
        scanner.close();

    }

}
