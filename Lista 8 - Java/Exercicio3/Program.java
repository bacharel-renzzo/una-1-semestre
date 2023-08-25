package Exercicio3;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Informe, por gentileza, o valor da base do retângulo: ");
    double base = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor da altura do retângulo: ");
    double altura = scanner.nextDouble();

    double areaRetangulo = retangulo.calcularArea(base, altura);
    double perimetroRetangulo = retangulo.calcularPerimetro(base, altura);

    System.out.println("A área do retângulo é: " + areaRetangulo);
    System.out.println("O perimetro do retângulo é: " + perimetroRetangulo);

    scanner.close();

  }

}
