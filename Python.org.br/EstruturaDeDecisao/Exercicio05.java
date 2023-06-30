package EstruturaDeDecisao;

import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 23/05/2023
 */

public class Exercicio05 {

  public static void main(String[] args) {

    // Faça um programa para a leitura de duas notas parciais de um aluno. O
    // programa deve calcular a média alcançada por aluno e apresentar:
    // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    // A mensagem "Reprovado", se a média for menor do que sete;
    // A mensagem "Aprovado com Distinção", se a média for igual a dez.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double notaUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double notaDois = scanner.nextDouble();

    double notaMediaAluno = (notaUm + notaDois) / 2;

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
