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

public class Exercicio20 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um Programa para leitura de três notas parciais de um aluno. O programa
    // deve calcular a média alcançada por aluno e presentar:
    // A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
    // média alcançada;
    // A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média
    // alcançada;
    // A mensagem "Aprovado com Distinção", se a média for igual a 10.

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double notaUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double notaDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double notaTres = scanner.nextDouble();

    double notaMediaAluno = (notaUm + notaDois + notaTres) / 3;

    if (notaMediaAluno == 10) {

      System.out.println("Aprovado com Distição");

    } else if (notaMediaAluno >= 7) {

      System.out.println("Aprovado");

    } else {

      System.out.println("Reprovado");

    }

    scanner.close();

  }

}
