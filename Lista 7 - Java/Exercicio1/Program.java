package Exercicio1;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("String 1: ");
    String a = scanner.nextLine();

    System.out.print("String 2: ");
    String b = scanner.nextLine();

    System.out.println("Tamanho de " + a + ": " + a.length() + " caracteres");

    System.out.println("Tamanho de " + b + ": " + b.length() + " caracteres");

    if (a.length() != b.length()) {

      System.out.println("As duas strings são de tamanhos diferentes.");

    } else {

      System.out.println("As duas strings possuem o mesmo tamanho.");

    }

    if (a.equals(b)) {

      System.out.println("As duas strings possuem o mesmo conteúdo.");

    } else {

      System.out.println("As duas strings possuem diferentes conteúdos.");

    }

    scanner.close();

  }

}