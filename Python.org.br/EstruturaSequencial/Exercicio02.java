import java.util.Locale;
import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Faça um Programa que peça um número e então mostre a mensagem O número
        // informado foi [número].

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número: ");
        double numero = scanner.nextDouble();

        System.out.println("O número informado é: " + numero);

        scanner.close();

    }

}
