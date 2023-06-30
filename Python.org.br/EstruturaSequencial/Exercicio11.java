import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio11 {
    public static void main(String[] args) {

        // Faça um Programa que peça 2 números inteiros e um número real. Calcule e
        // mostre o produto do dobro do primeiro número com metade do segundo número, a
        // soma do triplo do primeiro número com o terceiro e o terceiro número elevado
        // ao cubo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.println("Informe, por gentileza, um número inteiro: ");
        int primeiroNumeroInteiro = scanner.nextInt();

        System.out.println("Informe, por gentileza, um número inteiro: ");
        int segundoNumeroInteiro = scanner.nextInt();

        double resultadoA = (primeiroNumeroInteiro * 2) * (segundoNumeroInteiro / 2);
        double resultadoB = (primeiroNumeroInteiro * 3) + numeroReal;
        double resultadoC = Math.pow(segundoNumeroInteiro, 3);

        System.out.println("O resultado do produto do dobro do primeiro com metade do segundo: " + resultadoA);
        System.out.println("A soma do triplo do primeiro núm com o terceiro: " + resultadoB);
        System.out.println("o terceiro número elevado ao cubo: " + resultadoC);

        scanner.close();

    }

}