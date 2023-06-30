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

public class Exercicio14 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um programa que lê as duas notas parciais obtidas por um aluno numa
    // disciplina ao longo de um semestre, e calcule a sua média.
    // A atribuição de conceitos obedece à tabela abaixo:
    // Média de Aproveitamento | Conceito
    // Entre 9.0 e 10.0 | A
    // Entre 7.5 e 9.0 | B
    // Entre 6.0 e 7.5 | C
    // Entre 4.0 e 6.0 | D
    // Entre 4.0 e 0.0 | E

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double primeiraNotaParcial = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double segundaNotaParcial = scanner.nextDouble();

    double mediaParcialAluno = (primeiraNotaParcial + segundaNotaParcial) / 2;

    if (mediaParcialAluno == 0 || mediaParcialAluno < 4.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: E");

    } else if (mediaParcialAluno > 4.0 && mediaParcialAluno < 6.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: D");

    } else if (mediaParcialAluno > 6.0 && mediaParcialAluno < 7.5) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: C");

    } else if (mediaParcialAluno > 7.5 && mediaParcialAluno < 9.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: B");

    } else if (mediaParcialAluno > 9.0 && mediaParcialAluno < 10.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: A");

    } else {

      System.out.println("Erro ao calcular a média parcial e o conceito da nota de tal aluno.");

    }

    scanner.close();

  }
}