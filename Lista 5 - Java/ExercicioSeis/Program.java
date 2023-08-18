package ExercicioSeis;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FuncSoma func = new FuncSoma();

    System.out.println("Informe, por gentileza, um número: ");
    double n1 = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número: ");
    double n2 = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número: ");
    double n3 = scanner.nextDouble();

    double resultado = func.CalcularSoma(n1, n2, n3);

    System.out.println("A soma dos números informados é: " + resultado);

    scanner.close();

  }
}
