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

public class Exercicio12 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
    // descontos são do Imposto de Renda, que depende do salário bruto (conforme
    // tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
    // Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
    // Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá
    // pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
    // mês.

    // Desconto do IR:
    // Salário Bruto até 900 (inclusive) - isento
    // Salário Bruto até 1500 (inclusive) - desconto de 5%
    // Salário Bruto até 2500 (inclusive) - desconto de 10%
    // Salário Bruto acima de 2500 - desconto de 20%
    // Imprima na tela as informações,
    // dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a
    // quantidade de hora é 220

    System.out.println("Informe, por gentileza, o valor da sua hora: ");
    double valorHora = scanner.nextDouble();

    System.out.println("Informe, por gentileza, a quantidade de horas que você trabalhou no mês: ");
    double quantidadeHorasTrabalhadasMes = scanner.nextDouble();

    double salarioMes = valorHora * quantidadeHorasTrabalhadasMes;
    double descontoSindicato = salarioMes * 0.03;
    double descontoFGTS = salarioMes * 0.11;
    double salarioLiquido = salarioMes - (descontoSindicato + descontoFGTS);

    if (salarioMes <= 900) {

      double totalDeDescontos = descontoFGTS + descontoSindicato;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você está isento do desconto do imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontos);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 900 && salarioMes <= 1500) {

      double impostoDeRendaCincoPorCento = salarioMes * 0.05;
      double totalDeDescontosCincoPorCento = descontoFGTS + descontoSindicato + impostoDeRendaCincoPorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaCincoPorCento + " de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosCincoPorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 1500 && salarioMes <= 2500) {

      double impostoDeRendaDezPorCento = salarioMes * 0.1;
      double totalDeDescontosDezPorCento = descontoFGTS + descontoSindicato + impostoDeRendaDezPorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaDezPorCento + "de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosDezPorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 2500) {

      double impostoDeRendaVintePorCento = salarioMes * 0.2;
      double totalDeDescontosVintePorCento = descontoFGTS + descontoSindicato + impostoDeRendaVintePorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaVintePorCento + " de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosVintePorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else {

      System.out.println("Erro ao calcular o imposto de renda à ser pago.");

    }

    scanner.close();

  }
}