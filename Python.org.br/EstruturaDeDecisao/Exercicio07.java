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

public class Exercicio07 {

  public static void main(String[] args) {

    // Faça um Programa que leia três números e mostre o maior e o menor deles.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número: ");
    double numeroUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número (Diferente do primeiro.)");
    double numeroDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número (Diferente do primeiro e do segundo.)");
    double numeroTres = scanner.nextDouble();

    if (numeroUm > numeroTres && numeroUm > numeroTres) {

      System.out.println("O primeiro número é o maior.");

    } else if (numeroDois > numeroUm && numeroDois > numeroTres) {

      System.out.println("O segundo número é o maior.");

    } else {

      System.out.println("O terceiro número é o maior");

    }

    if (numeroUm < numeroDois && numeroUm < numeroTres) {

      System.out.println("O primeiro número é o menor.");

    } else if (numeroDois < numeroUm && numeroDois < numeroTres) {

      System.out.println("O segundo número é o menor.");

    } else if (numeroTres < numeroUm && numeroTres < numeroDois) {

      System.out.println("O terceiro número é o menor.");

    }

    scanner.close();

  }

}
