package PontoERetanguloClass;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    /*
     * Possua uma classe chamada Ponto, com os atributos x e y.
     * Possua uma classe chamada Retangulo, com os atributos largura e altura.
     * Possua uma função para imprimir os valores da classe Ponto
     * Possua uma função para encontrar o centro de um Retângulo.
     * Você deve criar alguns objetos da classe Retangulo.
     * Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior
     * esquerdo do retângulo, que deve ser um objeto da classe Ponto.
     * A função para encontrar o centro do retângulo deve retornar o valor para um
     * objeto do tipo ponto que indique os valores de x e y para o centro do objeto.
     * O valor do centro do objeto deve ser mostrado na tela
     * Crie um menu para alterar os valores do retângulo e imprimir o centro deste
     * retângulo.
     */

    Scanner scanner = new Scanner(System.in);

    // Criar um objeto da classe Retangulo
    Ponto pontoInicial = new Ponto(0, 0);
    Retangulo retangulo = new Retangulo(5, 3, pontoInicial);

    int opcao = 0;

    while (opcao != 3) {
      System.out.println("----- Menu -----");
      System.out.println("1. Alterar valores do retângulo");
      System.out.println("2. Imprimir centro do retângulo");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite a largura do retângulo: ");
          double largura = scanner.nextDouble();
          System.out.print("Digite a altura do retângulo: ");
          double altura = scanner.nextDouble();
          retangulo.alterarValores(largura, altura);
          break;
        case 2:
          Ponto centro = retangulo.encontrarCentro();
          centro.imprimir();
          break;
        case 3:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida. Digite novamente.");
      }

      System.out.println();
    }

    scanner.close();
  }
}