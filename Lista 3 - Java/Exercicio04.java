
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / 5;
        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);

        scanner.close();
    }
}
