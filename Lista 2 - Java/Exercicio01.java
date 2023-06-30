
/**
* Leia atentamente as instruções do programa para obter a melhor experiência de tal.
* @author - Renzzo Silva Rocha - RA: 4231925318
* @version - 2.0
* @since - 17/04/2023
*/

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Um algoritmo que lê três números a partir do teclado e apresenta o maior número, o menor número, e a média dos três números.");

        System.out.println("Informe, por gentileza, o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o terceiro número: ");
        double num3 = scanner.nextDouble();

        double mediaAritmetica = (num1 + num2 + num3) / 3;

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior em relação aos outros");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior em relação aos outros");

        } else {
            System.out.println("O terceiro número é o maior em relacação aos outros");

        }

        System.out.printf("A média aritmética dos três números é: %.2f ", mediaAritmetica);

        scanner.close();

    }

}
