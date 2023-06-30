package EstruturaDeDecisao;

import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 23/05/2023
 */

public class Exercicio01 {

  public static void main(String[] args) {

    // Faça um Programa que peça dois números e imprima o maior deles.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o primeiro número: ");
    double numeroUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o segundo número: ");
    double numeroDois = scanner.nextDouble();

    if (numeroUm > numeroDois) {

      System.out.println("O número " + numeroUm + "é o maior.");

    } else {

      System.out.println("O número " + numeroDois + " é o maior.");

    }

    scanner.close();

  }

}
