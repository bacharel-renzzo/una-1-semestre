
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 05/05/2023
 */

import java.util.Scanner;

public class calculoDeIMC {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Calcular IMC");

    System.out.println("Informe, por gentileza, o seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Informe, por gentileza, a sua altura: ");
    double altura = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o seu peso: ");
    double peso = scanner.nextDouble();

    double calculoIMC = peso / Math.pow(altura, 2);

    if (calculoIMC < 18.5) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Magreza");

    } else if (calculoIMC >= 18.5 && calculoIMC < 25.0) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Normal");

    } else if (calculoIMC >= 25.0 && calculoIMC < 29.9) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Sobrepeso");

    } else if (calculoIMC >= 30.0 && calculoIMC < 34.9) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Obesidade Grau I");

    } else if (calculoIMC >= 35.0 && calculoIMC < 39.9) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Obesidade Grau II");

    } else if (calculoIMC > 40.0) {

      System.out.println("O seu nome é: " + nome);
      System.out.println("A sua altura é: " + altura + "cm");
      System.out.println("O seu peso é: " + peso + "kg");
      System.out.printf("O seu IMC é: %.2f\n", calculoIMC);
      System.out.println("A classificação do seu IMC é: Obesidade Grau III");

      scanner.close();

    }

  }

}