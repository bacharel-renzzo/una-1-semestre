import java.util.Locale;
import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, o raio do círculo: ");
        double raioDoCirculo = scanner.nextDouble();

        double areaDoCirculo = Math.PI * Math.pow(raioDoCirculo, 2);

        System.out.println("A área do círculo é: " + areaDoCirculo);

        scanner.close();
    }

}