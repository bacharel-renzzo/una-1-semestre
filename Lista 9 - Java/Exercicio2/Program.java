package Exercicio2;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] items = new String[10];
    double[] prices = new double[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o nome do item " + (i + 1) + ": ");
      items[i] = scanner.nextLine();

      System.out.print("Digite o valor do item " + (i + 1) + ": ");
      prices[i] = Double.parseDouble(scanner.nextLine());
    }

    try {
      FileWriter fileWriter = new FileWriter("itens_supermercado.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < 10; i++) {
        bufferedWriter.write(items[i] + " - R$" + prices[i]);
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
      System.out.println("Itens e valores salvos no arquivo itens_supermercado.txt.");
    } catch (IOException e) {
      System.err.println("Erro ao escrever no arquivo.");
      e.printStackTrace();
    }

    scanner.close();
  }
}
