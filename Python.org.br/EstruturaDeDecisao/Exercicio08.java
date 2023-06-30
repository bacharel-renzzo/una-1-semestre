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

public class Exercicio08 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    // Faça um programa que pergunte o preço de três produtos e informe qual produto
    // você deve comprar, sabendo que a decisão é sempre pelo mais barato.

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoTres = scanner.nextDouble();

    if (produtoUm < produtoDois && produtoUm < produtoTres) {

      System.out.println("O primeiro produto é o mais barato.");

    } else if (produtoDois < produtoUm && produtoDois < produtoTres) {

      System.out.println("O segundo produto é o mais barato.");

    } else {

      System.out.println("O terceiro produto é o mais barato");

    }

    scanner.close();

  }
}