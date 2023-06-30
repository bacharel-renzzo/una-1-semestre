import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio16 {
    public static void main(String[] args) {

        // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
        // em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
        // é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
        // 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de
        // tinta a serem compradas e o preço total.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
        double tamanhoArea = scanner.nextDouble();

        double litrosTinta = tamanhoArea / 3.0;
        int latasTinta = (int) Math.ceil(litrosTinta / 18.0);
        double precoTotal = latasTinta * 80.0;

        System.out.println("Você precisa comprar " + latasTinta + " latas de tinta.");
        System.out.println("O preço total é R$" + precoTotal);

        scanner.close();

    }
}