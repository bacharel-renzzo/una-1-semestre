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

public class Exercicio27 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Uma fruteira está vendendo frutas com a seguinte tabela de preços:

    // Até 5 Kg Acima de 5 Kg
    // Morango R$ 2,50 por Kg R$ 2,20 por Kg
    // Maçã R$ 1,80 por Kg R$ 1,50 por Kg

    // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
    // ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.

    // Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
    // (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

    System.out.println("Informe a quantidade (em Kg) de morangos adquirida pelo cliente: ");
    double quantidadeMorango = scanner.nextDouble();

    System.out.println("Informe a quantidade (em Kg) de maçãs adquirida pelo cliente: ");
    double quantidadeMaca = scanner.nextDouble();

    double totalDeFrutas = quantidadeMaca + quantidadeMorango;

    double valorMorango;
    if (quantidadeMorango <= 5) {

      valorMorango = quantidadeMorango * 2.5;
    } else {

      valorMorango = quantidadeMorango * 2.2;
    }

    double valorMaca;

    if (quantidadeMaca <= 5) {

      valorMaca = quantidadeMaca * 1.8;

    } else {

      valorMaca = quantidadeMaca * 1.5;

    }

    double valorTotal = valorMorango + valorMaca;

    if (totalDeFrutas > 8 || valorTotal > 25) {

      valorTotal -= valorTotal * 0.1;

    }

    System.out.println("O valor a ser pago pelo cliente é: " + valorTotal);

    scanner.close();
  }

}