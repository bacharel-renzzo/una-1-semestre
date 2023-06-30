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

public class Exercicio02 {

  public static void main(String[] args) {

    // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
    // negativo

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um valor: ");
    double valor = scanner.nextDouble();

    if (valor > 0) {

      System.out.println("O valor é positivo.");

    } else {

      System.out.println("O valor é negativo.");

    }

    scanner.close();

  }

}