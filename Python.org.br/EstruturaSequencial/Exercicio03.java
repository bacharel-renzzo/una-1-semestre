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

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Faça um Programa que peça dois números e imprima a soma.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, um número: ");
        double numeroUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, outro número: ");
        double numeroDois = scanner.nextDouble();

        double somaDosDoisNumeros = numeroUm + numeroDois;

        System.out.println("A soma dos dois números é: " + somaDosDoisNumeros);

        scanner.close();
    }

}
