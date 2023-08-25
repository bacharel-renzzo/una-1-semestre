package Exercicio3;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número de CPF no formato xxx.xxx.xxx-xx: ");
    String CPF = scanner.next();

    if (validarCPF(CPF)) {

      System.out.println("CPF Válido");

    } else {

      System.out.println("CPF Inválido");

    }

    scanner.close();

  }

  public static boolean validarCPF(String cpf) {

    cpf = cpf.replace(".", "").replace("-", "");

    if (cpf.length() != 11) {

      return false;

    }

    for (char c : cpf.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }

    return true;

  }

}
