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

public class Exercicio09 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que leia três números e mostre-os em ordem decrescente

    System.out.println("Digite o primeiro número: ");
    int numero1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int numero2 = scanner.nextInt();

    System.out.println("Digite o terceiro número: ");
    int numero3 = scanner.nextInt();

    if (numero1 >= numero2 && numero1 >= numero3) {
      if (numero2 >= numero3) {
        System.out.println(numero1 + ", " + numero2 + ", " + numero3);

      } else {
        System.out.println(numero1 + ", " + numero3 + ", " + numero2);
      }

    } else if (numero2 >= numero1 && numero2 >= numero3) {
      if (numero1 >= numero3) {
        System.out.println(numero2 + ", " + numero1 + ", " + numero3);
      } else {
        System.out.println(numero2 + ", " + numero3 + ", " + numero1);
      }

    } else {
      if (numero1 >= numero2) {
        System.out.println(numero3 + ", " + numero1 + ", " + numero2);
      } else {
        System.out.println(numero3 + ", " + numero2 + ", " + numero1);

      }

    }

    scanner.close();

  }

}
