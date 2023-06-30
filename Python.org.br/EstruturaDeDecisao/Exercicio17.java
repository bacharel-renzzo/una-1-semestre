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

public class Exercicio17 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que peça um número correspondente a um determinado ano e em
    // seguida informe se este ano é ou não bissexto.

    System.out.println("Informe, por gentileza, um número correspondente a um determinado ano: ");
    int anoBissextoChecker = scanner.nextInt();

    if (anoBissextoChecker % 400 == 0 || (anoBissextoChecker % 4 == 0 && anoBissextoChecker % 100 != 0)) {

      System.out.println(anoBissextoChecker + " é um ano bissexto.");

    } else {

      System.out.println(anoBissextoChecker + " não é um ano bissexto.");

    }

    scanner.close();
  }

}
