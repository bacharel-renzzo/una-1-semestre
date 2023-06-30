import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio17 {
  public static void main(String[] args) {

    // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho
    // em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
    // é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
    // 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$
    // 25,00.

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
    double tamanhoArea = scanner.nextDouble();

    double litrosTinta = tamanhoArea / 6.0;

    int latasTinta = (int) Math.ceil(litrosTinta / 18.0);

    int galoesTinta = (int) Math.ceil(litrosTinta / 3.6);

    int latasMix = (int) Math.ceil((litrosTinta * 1.1) / 18.0);

    int galoesMix = (int) Math.ceil((litrosTinta * 1.1) / 3.6);

    double precoLatas = latasTinta * 80.0;

    double precoGaloes = galoesTinta * 25.0;

    double precoMix = (latasMix * 80.0) + (galoesMix * 25.0);

    System.out.println("Situação 1: comprar apenas latas de 18 litros.");

    System.out.println("Você precisa comprar " + latasTinta + " latas de tinta.");

    System.out.println("O preço total é R$" + precoLatas);

    System.out.println("Situação 2: comprar apenas galões de 3,6 litros.");

    System.out.println("Você precisa comprar " + galoesTinta + " galões de tinta.");

    System.out.println("O preço total é R$" + precoGaloes);

    System.out.println("Situação 3: misturar latas e galões de forma que o desperdício de tinta seja menor.");

    System.out.println("Você precisa comprar " + latasMix + " latas e " + galoesMix + " galões de tinta.");

    System.out.println("O preço total é R$" + precoMix);

    scanner.close();

  }
}