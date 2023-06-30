package EstruturaDeDecisao;

import java.util.Scanner;
import java.util.Locale;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 23/05/2023
 */

public class Exercicio22 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que peça um número inteiro e determine se ele é par ou
    // impar. Dica: utilize o operador módulo (resto da divisão).

    System.out.println("Informe, por gentileza, um número inteiro: ");
    int numeroInteiro = scanner.nextInt();

    if (numeroInteiro % 2 == 0) {

      System.out.println("O número inteiro escolhido é par.");

    } else {

      System.out.println("O número inteiro escolhido é impar.");

    }

    scanner.close();
  }
}