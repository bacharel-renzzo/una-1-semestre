
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que determina quantos carros e motos há em um estacionamento.");

        System.out.println("Escreva o total de veículos do estacionamento: ");
        int veiculos = scanner.nextInt();

        System.out.println("Escreva o total de rodas presentes no estacionamento: ");
        int rodas = scanner.nextInt();

        int motos = (4 * veiculos - rodas) / 2;
        int carros = veiculos - motos;

        System.out.println("O números de carros no estacionamento é: " + carros);
        System.out.println("O número de motos no estacionamento é: " + motos);

        scanner.close();

    }

}
