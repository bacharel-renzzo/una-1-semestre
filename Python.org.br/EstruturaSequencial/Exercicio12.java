import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio12 {
    public static void main(String[] args) {

        // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
        // calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Informe, por gentileza, a sua altura (Utilizar virgula caso deseje separar unidades de medida): ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal é: " + pesoIdeal);

        scanner.close();

    }

}