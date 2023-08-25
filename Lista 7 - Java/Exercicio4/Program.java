package Exercicio4;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] numerosAteDezenove = {
        "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove",
        "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"
    };

    String[] dezenas = {
        "", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"
    };

    System.out.println("Digite um número até 99: ");
    int numero = scanner.nextInt();

    if (numero < 0 || numero > 99) {

      System.out.println("Número Inválido.");

    }

    else if (numero < 20) {

      System.out.println(numerosAteDezenove[numero]);

    }

    else {

      int dezena = numero / 10;
      int unidade = numero % 10;

      if (unidade == 0) {
        System.out.println(dezenas[dezena]);
      } else {
        System.out.println(dezenas[dezena] + " e " + numerosAteDezenove[unidade]);
      }
    }

    scanner.close();

  }

}
