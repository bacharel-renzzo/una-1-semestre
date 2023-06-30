import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio13 {
    public static void main(String[] args) {

        // Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
        // que calcule seu peso ideal, utilizando as seguintes fórmulas: Para homens -
        // (72.7*h) - 58 e Para mulheres - (62.1*h) -44.7

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe, por gentileza, a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe, por gentileza o seu sexo biológico (M) para masculino e (F) para feminino: ");
        String sexoBiologico = scanner.next();

        if (sexoBiologico.equalsIgnoreCase("M")) {

            double pesoIdealHomem = (72.7 * altura) - 58;
            System.out.printf("O peso ideal para o seu sexo biológico é: %.2f", pesoIdealHomem);

        }

        else if (sexoBiologico.equalsIgnoreCase("F")) {

            double pesoIdealMulher = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para o seu sexo biológico é: %.2f", pesoIdealMulher);

        }

        scanner.close();

    }

}