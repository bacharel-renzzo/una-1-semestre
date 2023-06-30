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

public class Exercicio21 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
    // usuário a valor do saque e depois informar quantas notas de cada valor serão
    // fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O
    // valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se
    // preocupar com a quantidade de notas existentes na máquina.

    // Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas
    // de 100, uma nota de 50, uma nota de 5 e uma nota de 1;

    // Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas
    // de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de
    // 1.

    System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
    int valorSaque = scanner.nextInt();

    if (valorSaque < 10 || valorSaque > 600) {
      System.out.println("Valor inválido. O valor mínimo é 10 e o máximo é 600 reais.");
    } else {
      int nota100 = valorSaque / 100;
      int valorRestante = valorSaque % 100;

      int nota50 = valorRestante / 50;
      valorRestante %= 50;

      int nota10 = valorRestante / 10;
      valorRestante %= 10;

      int nota5 = valorRestante / 5;
      valorRestante %= 5;

      int nota1 = valorRestante;

      System.out.println("Notas fornecidas:");
      if (nota100 > 0) {
        System.out.println(nota100 + " nota(s) de 100 reais");
      }
      if (nota50 > 0) {
        System.out.println(nota50 + " nota(s) de 50 reais");
      }
      if (nota10 > 0) {
        System.out.println(nota10 + " nota(s) de 10 reais");
      }
      if (nota5 > 0) {
        System.out.println(nota5 + " nota(s) de 5 reais");
      }
      if (nota1 > 0) {
        System.out.println(nota1 + " moeda(s) de 1 real");
      }
    }

    scanner.close();

  }
}
