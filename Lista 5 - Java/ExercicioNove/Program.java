package ExercicioNove;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    FuncReverse func = new FuncReverse();


    System.out.println("Digite um número inteiro: ");
    int numeroOriginal = scanner.nextInt();

    int reverso = func.reversoNumero(numeroOriginal);

    System.out.println("O reverso de " + numeroOriginal + " é " + reverso);

    scanner.close();


  }

}
