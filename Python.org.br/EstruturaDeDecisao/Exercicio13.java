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

public class Exercicio13 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que leia um número e exiba o dia correspondente da semana.
    // (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor
    // inválido

    System.out.println("Informe, por gentileza, um número em um intervalo de 1-7: ");
    String numeroDoDiaDaSemana = scanner.nextLine();

    switch (numeroDoDiaDaSemana) {

      case "1":
        System.out.println("Domingo");
        break;

      case "2":
        System.out.println("Segunda");
        break;

      case "3":
        System.out.println("Terça");
        break;

      case "4":
        System.out.println("Quarta");
        break;

      case "5":
        System.out.println("Quinta");
        break;

      case "6":
        System.out.println("Sexta");
        break;

      case "7":
        System.out.println("Sabado");
        break;

    }

    scanner.close();

  }
}