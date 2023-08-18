package ExercicioDois;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    FuncPorcentagem func = new FuncPorcentagem();

    System.out.println("Informe o valor do produto: ");
    double valorProduto = scanner.nextDouble();

    double novoValorProduto = func.NewValue(valorProduto);

    System.out.println("Novo valor do produto: " + novoValorProduto);

    scanner.close();

  }

}
