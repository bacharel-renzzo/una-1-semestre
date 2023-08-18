package ExercicioUm;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    FuncMedia func = new FuncMedia();

    System.out.println("Informe, por gentileza, um número: ");
    double num1 = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número: ");
    double num2 = scanner.nextDouble();

    double resultadoMedia = func.MediaAritmetica(num1, num2);

    System.out.println("O resultado da média aritmética dos dois números solicitados é: " + resultadoMedia);

    scanner.close();

  }

}
