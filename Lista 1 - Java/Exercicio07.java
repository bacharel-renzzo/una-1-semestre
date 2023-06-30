
/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 03/04/2023
 */

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Programa que imprime o salário total do vendedor, seu salário fixo, o total das vendas que ele realizou no mês e o percentual que ele ganha sobre o total das vendas mensais");

        System.out.println("Escreva o salário fixo de um vendedor: ");
        double salario = scanner.nextDouble();

        System.out.println("Escreva o valor total das vendas que o vendedor realizou no mês: ");
        double vendas = scanner.nextDouble();

        System.out.println("Escreva o percentual que o vendedor ganha sobre as vendas mensais: ");
        double comissao = scanner.nextDouble();

        double salarioTotal = salario + (vendas * comissao) / 100;

        System.out.println("O salario total do vendedor é: R$ " + salarioTotal);
        scanner.close();

    }

}
