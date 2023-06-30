import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Faça um Programa que pergunte quanto você ganha por hora e o número de horas
        // trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
        // sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
        // 5% para o sindicato.

        System.out.println("Informe, por gentileza, o quanto você recebe por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o número de horas que você trabalha por mês: ");
        double horasTrabalhadasPorMes = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadasPorMes;
        double inss = salarioBruto * 8 / 100;
        double impostoDeRenda = salarioBruto * 11 / 100;
        double sindicato = salarioBruto * 5 / 100;
        double salarioLiquido = salarioBruto - inss - impostoDeRenda - sindicato;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("IR(11%): " + impostoDeRenda);
        System.out.println("INSS(8%): " + inss);
        System.out.println("Sindicato (5%): " + sindicato);
        System.out.println("Salário Liquido: " + salarioLiquido);

        scanner.close();

    }
}