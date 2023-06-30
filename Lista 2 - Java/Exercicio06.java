
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 2.0
 * @since - 17/04/2023
 */

import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Sorteio de um número aleatório");

        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        System.out.println("O número sorteado foi: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é ímpar.");
        }

        scanner.close();
    }

}
