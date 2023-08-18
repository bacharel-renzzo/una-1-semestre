package ExercicioSete;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FuncPOuN func = new FuncPOuN();

    System.out.println("Informe, por gentileza, um valor: ");
    double valorInformado = scanner.nextDouble();

    func.POuN(valorInformado);

    scanner.close();

  }

}
