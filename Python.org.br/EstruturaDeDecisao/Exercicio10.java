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

public class Exercicio10 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que pergunte em que turno você estuda.
    // Peça para digitar
    // M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
    // Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

    System.out
        .println("Informe, por gentileza, o turno que você estuda (M - Matutino / V - Vespertino e N - Noturno): ");
    String turno = scanner.nextLine();

    switch (turno) {

      case "M":
        System.out.println("Bom Dia!");
        break;

      case "V":
        System.out.println("Boa Tarde!");
        break;

      case "N":
        System.out.println("Boa Noite!");
        break;

      default:
        System.out.println("Valor Inválido");

    }

    scanner.close();
  }
}