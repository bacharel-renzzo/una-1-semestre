package Exercicio2;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, seu nome: ");
    String nome = scanner.nextLine();

    String nomeMaiusculo = nome.toUpperCase();

    String nomeInvetido = "";

    for (int i = nomeMaiusculo.length() - 1; i >= 0; i--) {

      nomeInvetido += nomeMaiusculo.charAt(i);

    }

    System.out.println("Nome invertido em letras maiúsculas: " + nomeInvetido);

    scanner.close();

  }

}
