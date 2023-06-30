
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

import java.lang.Math;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de calcular Juros Compostos de uma Aplicação Financeira");

        System.out.println("Informe o valor do capital aplicado: ");
        double capital = scanner.nextDouble();

        System.out.println("Informe o prazo da aplicação em mêses (1-12): ");
        int prazoAplicacao = scanner.nextInt();

        System.out.println("Informe a taxa de juros mensal: ");
        double taxaDeJuros = scanner.nextDouble();

        double montante = capital * Math.pow(1 + prazoAplicacao, taxaDeJuros);

        System.out.printf("O valor do montante a ser recebido é: R$ " + montante);
        scanner.close();

    }

}
