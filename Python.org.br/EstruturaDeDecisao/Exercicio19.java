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

public class Exercicio19 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa que leia um número inteiro menor que 1000 e imprima a
    // quantidade de centenas, dezenas e unidades do mesmo

    System.out.println("Digite um número inteiro menor que 1000: ");
    int numero = scanner.nextInt();

    int centenas = numero / 100;
    int dezenas = (numero % 100) / 10;
    int unidades = (numero % 100) % 10;

    String resultado = "";

    if (centenas > 0) {

      resultado += centenas + (centenas == 1 ? " centena" : " centenas");

      if (dezenas > 0 || unidades > 0) {

        resultado += ", ";
      }
    }

    if (dezenas > 0) {

      resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");

      if (unidades > 0) {

        resultado += " e ";
      }
    }

    if (unidades > 0) {

      resultado += unidades + (unidades == 1 ? " unidade" : " unidades");

    }

    System.out.println(resultado);

    scanner.close();
  }

}
