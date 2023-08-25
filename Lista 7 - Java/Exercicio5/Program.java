package Exercicio5;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Valida e corrige número de telefone");

    System.out.println("Telefone: ");

    String numeroDeTelefone = scanner.next();

    System.out.println("O telefone possui " + numeroDeTelefone.length() + " digitos.");

    System.out.println("Vou acrescentar o digito nove na frente.");

    String nove = "9";

    System.out.println("Telefone corrigido sem formatação: " + nove + numeroDeTelefone.replace("-", ""));

    System.out.println("Telefone corrigido com formatação: " + nove + numeroDeTelefone);

    scanner.close();

  }

}
