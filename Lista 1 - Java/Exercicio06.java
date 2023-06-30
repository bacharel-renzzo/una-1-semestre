
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Programa que recebe dois números e imprime o logaritmo do primeiro número na base representada pelo segundo número");

        System.out.println("Informe o número: ");
        double numero = scanner.nextDouble();

        System.out.println("Informe a base: ");
        double base = scanner.nextDouble();

        double logaritmo = Math.log(numero) / Math.log(base);

        System.out.println("O logaritmo do número é: " + logaritmo);
        scanner.close();

    }

}
