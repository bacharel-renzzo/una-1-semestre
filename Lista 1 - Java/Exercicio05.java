
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que imprime o salário bruto a ser recebido por um funcionário em um mês");

        System.out.println("Informe o número de horas que o funcionário trabalhou no mês: ");
        int horas = scanner.nextInt();

        System.out.println("Informe o valor a ser recebido por hora de trabalho: ");
        double valor = scanner.nextDouble();

        System.out.println("Informe o valor do salário família: ");
        double salarioFamilia = scanner.nextDouble();

        System.out.println("Informe o número de filhos com idade menor que 14 anos ");
        int filhosMenores = scanner.nextInt();

        double salarioBruto = valor * horas + salarioFamilia * filhosMenores;

        System.out.println("O salário bruto a ser recebido pelo funcionário é: R$: " + salarioBruto);
        scanner.close();

    }

}
