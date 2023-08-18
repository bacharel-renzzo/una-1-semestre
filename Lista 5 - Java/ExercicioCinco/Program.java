package ExercicioCinco;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    FuncNesima func = new FuncNesima();

    System.out.println("Informe, por gentileza, um número inteiro: ");
    int numero = scanner.nextInt();

    func.calcularNesima(numero);

    scanner.close();

  }

}
