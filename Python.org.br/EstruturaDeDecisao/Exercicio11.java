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

public class Exercicio11 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // As Organizações Tabajara resolveram dar um aumento de salário aos seus
    // colaboradores e lhe contraram para desenvolver o programa que calculará os
    // reajustes.
    // Faça um programa que recebe o salário de um colaborador e o reajuste segundo
    // o seguinte critério, baseado no salário atual:
    // salários até R$ 280,00 (incluindo) : aumento de 20%
    // salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    // salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    // salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
    // realizado, informe na tela:
    // o salário antes do reajuste;
    // o percentual de aumento aplicado;
    // o valor do aumento;
    // o novo salário, após o aumento.

    System.out.println("Informe, por gentileza, o salário de um colaborador: ");
    double salario = scanner.nextDouble();

    if (salario <= 280) {

      double salarioVintePorCento = salario + (salario * 0.2);
      double aumentoDoSalarioVintePorCento = salario * 0.2;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioVintePorCento);
      System.out.println("O percentual aumentado foi de 20%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioVintePorCento);

    } else if (salario > 280 && salario < 780) {

      double salarioQuinzePorCento = salario + (salario * 0.15);
      double aumentoDoSalarioQuinzePorCento = salario * 0.15;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioQuinzePorCento);
      System.out.println("O percentual aumentado foi de 15%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioQuinzePorCento);

    } else if (salario > 780 && salario < 1500) {

      double salarioDezPorCento = salario + (salario * 0.1);
      double aumentoDoSalarioDezPorCento = salario * 0.1;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioDezPorCento);
      System.out.println("O percentual aumentado foi de 10%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioDezPorCento);

    } else if (salario > 1500) {

      double salarioCincoPorCento = salario + (salario * 0.05);
      double aumentoDoSalarioCincoPorCento = salario * 0.05;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioCincoPorCento);
      System.out.println("O percentual aumentado foi de 5%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioCincoPorCento);

    } else {

      System.out.println("Valor Inválido. Por favor, insira apenas o salário sem o (R$)");

    }

    scanner.close();

  }
}