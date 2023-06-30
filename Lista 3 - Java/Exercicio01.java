
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido, tente novamente.");
            }
        }

        System.out.println("Nota válida: " + nota);
        scanner.close();
    }
}
