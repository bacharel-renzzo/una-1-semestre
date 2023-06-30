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

public class Exercicio15 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
    // informar se os valores podem ser um triângulo. Indique, caso os lados formem
    // um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
    // Dicas:
    // Três lados formam um triângulo quando a soma de quaisquer dois lados for
    // maior que o terceiro;
    // Triângulo Equilátero: três lados iguais;
    // Triângulo Isósceles: quaisquer dois lados iguais;
    // Triângulo Escaleno: três lados diferentes;

    System.out.println("Informe, por gentileza, o valor do primeiro lado do triângulo: ");
    double ladoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do segundo lado do triângulo: ");
    double ladoDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do terceiro lado do triângulo: ");
    double ladoTres = scanner.nextDouble();

    double somaDosLadosDoTriangulo = ladoUm + ladoDois;

    if (somaDosLadosDoTriangulo > ladoTres) {

      System.out.println("Os três lados informados não formam um triângulo.");

    } else if (ladoUm == ladoDois && ladoDois == ladoTres) {

      System.out.println("O triângulo é classificado como: Equilátero.");

    } else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres) {

      System.out.println("O triângulo é classificado como: Isósceles");

    } else if (ladoUm != ladoDois && ladoUm != ladoTres && ladoDois != ladoTres) {

      System.out.println("O triângulo é classificado como: Escaleno.");

    } else {

      System.out.println("Não é possível calcular.");

    }

    scanner.close();

  }
}