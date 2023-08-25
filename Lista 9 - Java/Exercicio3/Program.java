package Exercicio3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Digite o CPF: ");
    String cpf = scanner.nextLine();

    System.out.println("Escolha o destino:");
    System.out.println("1. São Paulo");
    System.out.println("2. Nova York");
    System.out.println("3. Berlim");
    int escolha = scanner.nextInt();

    String destino = "";
    double valorPassagem = 0;

    switch (escolha) {
      case 1:
        destino = "São Paulo";
        valorPassagem = 250;
        break;
      case 2:
        destino = "Nova York";
        valorPassagem = 2400;
        break;
      case 3:
        destino = "Berlim";
        valorPassagem = 3800;
        break;
      default:
        System.out.println("Escolha inválida");
        System.exit(0);
    }

    int numeroPoltrona = new Random().nextInt(20) + 1;

    double valorTotal = valorPassagem;

    System.out.println("\nRecibo da Viagem");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + cpf);
    System.out.println("Destino: " + destino);
    System.out.println("Valor a ser pago: $" + valorTotal);
    System.out.println("Número da poltrona: " + String.format("%02d", numeroPoltrona));

    try {
      FileWriter writer = new FileWriter("recibo_viagem.txt");
      writer.write("Recibo da Viagem\n");
      writer.write("Nome: " + nome + "\n");
      writer.write("Idade: " + idade + "\n");
      writer.write("CPF: " + cpf + "\n");
      writer.write("Destino: " + destino + "\n");
      writer.write("Valor a ser pago: $" + valorTotal + "\n");
      writer.write("Número da poltrona: " + String.format("%02d", numeroPoltrona) + "\n");
      writer.close();
      System.out.println("\nRecibo salvo no arquivo recibo_viagem.txt");
    } catch (IOException e) {
      System.out.println("Erro ao gerar o arquivo do recibo");
    }

    scanner.close();
  }
}
