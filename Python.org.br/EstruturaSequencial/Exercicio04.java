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

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Faça um Programa que peça as 4 notas bimestrais e mostre a média.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a primeira nota bimestral: ");
        double notaBimestralUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a segunda nota bimestral: ");
        double notaBimestralDois = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a terceira nota bimestral: ");
        double notaBimestralTres = scanner.nextDouble();

        System.out.println("Informe, por gentileza, a quarta nota bimestral: ");
        double notaBimestralQuarta = scanner.nextDouble();

        double media = (notaBimestralUm + notaBimestralDois + notaBimestralTres + notaBimestralQuarta) / 4;

        System.out.println("A média das quatro notas bimestrais é: " + media);

        scanner.close();

    }
}