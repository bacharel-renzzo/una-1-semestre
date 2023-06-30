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

public class Exercicio03 {

  public static void main(String[] args) {

    // Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
    // letra escrever: F - Feminino, M - Masculino, Sexo Inválido

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma letra: ");

    String letra = scanner.next();

    if (letra.equals("F")) {

      System.out.println("Feminino.");

    } else if (letra.equals("M")) {

      System.out.println("Masculino.");

    } else {

      System.out.println("Letra inválida.");

    }

    scanner.close();

  }
}