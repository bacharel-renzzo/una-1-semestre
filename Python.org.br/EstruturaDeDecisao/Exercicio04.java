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

public class Exercicio04 {

  public static void main(String[] args) {

    // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma letra: ");
    String letra = scanner.nextLine();

    if (letra.equals("A")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("E")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("I")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("O")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("U")) {

      System.out.println("A letra escolhida é vogal.");

    } else {

      System.out.println("A letra escolhida é consoante. ");

    }

    scanner.close();

  }
}
