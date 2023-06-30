import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio08 {
  public static void main(String[] args) {

    // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
    // desta área para o usuário.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o seu valor/hora: ");
    double valorHora = scanner.nextDouble();

    System.out.println("Informe, por gentileza, quantas horas você trabalha por mês: ");
    double horasTrabalhadasPorMes = scanner.nextDouble();

    double salarioMensal = valorHora * horasTrabalhadasPorMes;

    System.out.println("O seu salário é de: " + salarioMensal + "reais.");

    scanner.close();

  }

}