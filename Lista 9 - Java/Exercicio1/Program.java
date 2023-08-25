package Exercicio1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[5];
    double[] notas = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
      nomes[i] = scanner.nextLine();

      System.out.print("Digite a nota final do(a) " + nomes[i] + ": ");
      notas[i] = Double.parseDouble(scanner.nextLine());
    }

    try {
      FileWriter fileWriter = new FileWriter("alunos_universidade.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      for (int i = 0; i < 5; i++) {
        bufferedWriter.write("Nome: " + nomes[i] + ", Nota: " + notas[i]);
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
      System.out.println("Dados dos alunos foram salvos no arquivo 'alunos_universidade.txt'.");
    } catch (IOException e) {
      System.out.println("Ocorreu um erro ao escrever no arquivo.");
      e.printStackTrace();
    }

    scanner.close();

  }
}
