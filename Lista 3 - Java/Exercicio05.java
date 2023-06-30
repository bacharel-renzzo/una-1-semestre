
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {

            if (i % 2 != 0) {

                System.out.println(i);

                scanner.close();
            }
        }
    }
}
