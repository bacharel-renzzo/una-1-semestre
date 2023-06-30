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

public class Exercicio23 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que peça um número e informe se o número é inteiro ou
    // decimal. Dica: utilize uma função de arredondamento.

    System.out.print("Digite um número: ");
    double numero = scanner.nextDouble();

    if (numero == Math.round(numero)) {
      System.out.println("O número é inteiro.");

    } else {
      System.out.println("O número é decimal.");

    }

    scanner.close();

  }
}
