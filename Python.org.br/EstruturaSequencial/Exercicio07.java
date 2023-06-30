import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio07 {
    public static void main(String[] args) {

        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
        // desta área para o usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, o valor de um lado do quadrado: ");
        double ladoUm = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o valor do outro lado do quadrado: ");
        double ladoDois = scanner.nextDouble();

        double areaDoQuadrado = ladoUm * ladoDois;

        System.out.println("O valor da área do quadrado é: " + areaDoQuadrado);
        System.out.println("O valor do dobro da área do quadrado é: " + areaDoQuadrado * 2);

        scanner.close();

    }

}