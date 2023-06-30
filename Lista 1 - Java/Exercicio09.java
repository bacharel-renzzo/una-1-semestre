
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Programa que recebe um número inteiro de segundos e imprime a quantidade correspondente em horas, minutos e segundos.");

        System.out.println("Informe o um número inteiro de segundos > 60: ");
        int seg = scanner.nextInt();

        int horas = seg / 3600;

        int minutos = seg / 60;

        int segundos = seg / seg;

        System.out.println("A quantidade correspondente em horas é: " + horas);
        System.out.println("A quantidade correspondente em minutos é: " + minutos);
        System.out.println("A quantidade correspondente em segundos é: " + segundos);
        scanner.close();

    }

}
