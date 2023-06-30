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

public class Exercicio26 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Um posto está vendendo combustíveis com a seguinte tabela de descontos:
    // Álcool:
    // até 20 litros, desconto de 3% por litro
    // acima de 20 litros, desconto de 5% por litro

    // Gasolina:
    // até 20 litros, desconto de 4% por litro
    // acima de 20 litros, desconto de 6% por litro

    // Escreva um algoritmo que leia o número de litros vendidos, o tipo de
    // combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
    // imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
    // gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90

    System.out.println("Informe o tipo de combustível: (A) para Álcool e (G) para Gasolina");
    String tipoDeCombustivel = scanner.nextLine();

    if (tipoDeCombustivel.equalsIgnoreCase("G")) {
      double precoLitroGasolina = 2.5;

      System.out.println("Informe a quantidade de litros abastecidos com Gasolina: ");
      double litrosAbastecidosGasolina = scanner.nextDouble();

      double valorTotalGasolina = precoLitroGasolina * litrosAbastecidosGasolina;

      if (litrosAbastecidosGasolina <= 20) {
        double descontoGasolinaAteVinteLitros = valorTotalGasolina * 4 / 100;
        double valorPagoGasolina = valorTotalGasolina - descontoGasolinaAteVinteLitros;
        System.out.println("O valor a ser pago por abastecer com Gasolina é: " + valorPagoGasolina);

      } else {

        double descontoGasolinaMaisVinteLitros = valorTotalGasolina * 6 / 100;
        double valorPagoGasolina = valorTotalGasolina - descontoGasolinaMaisVinteLitros;
        System.out.println("Desconto - O valor a ser pago por abastecer com Gasolina é: "
            + valorPagoGasolina);
      }
    } else if (tipoDeCombustivel.equalsIgnoreCase("A")) {
      double precoLitroAlcool = 1.9;

      System.out.println("Informe a quantidade de litros abastecidos com Álcool: ");
      double litrosAbastecidosAlcool = scanner.nextDouble();

      double valorTotalAlcool = precoLitroAlcool * litrosAbastecidosAlcool;

      if (litrosAbastecidosAlcool <= 20) {
        double descontoAlcoolAteVinteLitros = valorTotalAlcool * 3 / 100;
        double valorPagoAlcool = valorTotalAlcool - descontoAlcoolAteVinteLitros;
        System.out.println("O valor a ser pago por abastecer com Álcool é: " + valorPagoAlcool);

      } else {
        double descontoAlcoolMaisVinteLitros = valorTotalAlcool * 5 / 100;
        double valorPagoAlcool = valorTotalAlcool - descontoAlcoolMaisVinteLitros;
        System.out.println("Desconto - O valor a ser pago por abastecer com Álcool é: "
            + valorPagoAlcool);
      }
    }

    scanner.close();
  }
}