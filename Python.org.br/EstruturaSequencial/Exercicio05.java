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

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Faça um Programa que converta metros para centímetros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a quantidade de metros a ser convertida para centímetros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros / 100;

        System.out.println("A quantidade convertida é: " + centimetros + " centímetros");

        scanner.close();

    }

}