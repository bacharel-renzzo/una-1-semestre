import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio09 {
    public static void main(String[] args) {

        // Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
        // mostre a temperatura em graus Celsius.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a temperatura em graus Fahrenheit: ");
        double temperaturaEmFahrenheit = scanner.nextDouble();

        double conversaoParaGrausCelsius = 5 * ((temperaturaEmFahrenheit - 32) / 9);

        System.out.printf("A temperatura convertida de graus Fahrenheit para graus Celsius é: %.2f",
                conversaoParaGrausCelsius);

        scanner.close();

    }

}