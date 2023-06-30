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

public class Exercicio16 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um programa que calcule as raízes de uma equação do segundo grau, na
    // forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
    // consistências, informando ao usuário nas seguintes situações:

    // Se o usuário informar o valor de A igual a zero, a equação não é do segundo
    // grau e o programa não deve fazer pedir os demais valores, sendo encerrado;

    // Se o delta calculado for negativo, a equação não possui raizes reais. Informe
    // ao usuário e encerre o programa;

    // Se o delta calculado for igual a zero a equação possui apenas uma raiz real;
    // informe-a ao usuário;

    // Se o delta for positivo, a equação possui duas raiz reais; informe-as ao
    // usuário;

    System.out.println("Informe, por gentileza, o valor de A: ");
    double valorDeA = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor de B: ");
    double valorDeB = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor de C: ");
    double valorDeC = scanner.nextDouble();

    double valorDelta = Math.pow(valorDeB, 2) - 4 * (valorDeA) * (valorDeC);
    double valorx1 = (-valorDeB) + Math.sqrt(valorDelta) / 2 * valorDeA;
    double valorx2 = (-valorDeB) - Math.sqrt(valorDelta) / 2 * valorDeA;

    if (valorDeA == 0) {

      System.out.println("A equação não é de segundo grau, portanto, o programa será encerrado.");
      scanner.close();
      return;

    }

    if (valorDelta < 0) {

      System.out.println("A equação não possui raizes reais. O programa será encerrado.");

    } else if (valorDelta == 0 && valorDelta > valorDeA) {

      System.out.println("A equação possui apenas uma raiz real.");
      System.out.println("O valor da raiz real é: " + valorx1);

    } else if (valorDelta > 0) {

      System.out.println("A equação possui duas raizes reais.");
      System.out.println("O valor do x1 é: " + valorx1);
      System.out.println("O valor do x2 é: " + valorx2);

    } else {

      System.out.println("Erro no programa. O programa será encerrado.");

    }

    scanner.close();

  }
}