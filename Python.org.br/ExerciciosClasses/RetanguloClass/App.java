package RetanguloClass;

import java.util.Scanner;

public class App {

  /*
   * Classe Retangulo: Crie uma classe que modele um retangulo:
   * 
   * Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a
   * escolher)
   *
   * Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e
   * calcular Perímetro;
   * 
   * Crie um programa que utilize esta classe. Ele deve pedir ao usuário que
   * informe as medidades de um local. Depois, deve criar um objeto com as medidas
   * e calcular a quantidade de pisos e de rodapés necessárias para o local.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Informe, por gentileza, o valor do lado A: ");
    double ladoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do lado B: ");
    double ladoDois = scanner.nextDouble();

    double resultado = retangulo.calcularAreaRetangulo(ladoDois, ladoUm);

    System.out.println("O resultado do cálculo da área do retangulo é: " + resultado);

  
    scanner.close();

  }

}
