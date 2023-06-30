
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numeroDois = scanner.nextInt();

        System.out.println("Números no intervalo compreendido: ");
        if (numeroUm < numeroDois) {
            for (int i = numeroUm + 1; i < numeroUm; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = numeroDois + 1; i < numeroUm; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
