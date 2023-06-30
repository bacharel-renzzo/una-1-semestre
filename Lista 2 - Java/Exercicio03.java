
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 2.0
 * @since - 17/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo que resolve equações de segundo grau.");

        System.out.println("Informe, por gentileza, o coeficiente A: ");
        double coeficienteA = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o coeficiente B: ");
        double coeficienteB = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o coeficiente C: ");
        double coeficienteC = scanner.nextDouble();

        double delta = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

        if (coeficienteA == 0 && coeficienteB == 0 && coeficienteC != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (coeficienteA == 0 && coeficienteB != 0) {
            System.out.println("Esta é uma equação de primeiro grau");

            double equacaoDePrimeiroGrau = -coeficienteC / coeficienteB;
            System.out.printf("O resultado desta equação de primeiro grau é: %.2f", equacaoDePrimeiroGrau);
        } else if (delta < 0) {
            System.out.println("Esta equação possui duas raizes reais iguais.");
        } else if (delta > 0) {
            System.out.println("Esta equação possui duas raízes diferentes.");

            double x1 = (-coeficienteB - Math.sqrt(delta)) / 2 * coeficienteA;
            double x2 = (-coeficienteB + Math.sqrt(delta)) / 2 * coeficienteA;

            System.out.println("O x1 da equação é: " + x1);
            System.out.println("O x2 da equação é: " + x2);
        } else {
            System.out.println("A equação possui apenas um número dentro do conjunto dos números reais. ");
        }

        scanner.close();
    }
}
