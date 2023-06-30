
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 2.0
 * @since - 17/04/2023
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out
                .println("Algoritmo de uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes.");

        System.out.println("Informe, por gentileza, o valor da compra: ");
        int valorDaCompra = scanner.nextInt();

        System.out.println("Informe, por gentileza, o valor pago: ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorDaCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        }

        // TROCO

        int troco = valorPago - valorDaCompra;
        System.out.println("O troco da sua compra é R$: " + troco);

        // Contagem de notas

        int notaDeCinquenta = (troco / 50);
        troco -= notaDeCinquenta * 50;
        System.out.println("Notas de R$: 50,00: " + notaDeCinquenta);

        int notaDeVinte = (troco / 20);
        troco -= notaDeVinte * 20;
        System.out.println("Notas de R$: 20,00: " + notaDeVinte);

        int notaDeDez = (troco / 10);
        troco -= notaDeDez * 10;
        System.out.println("Notas de R$: 10,00: " + notaDeDez);

        int notaDeCinco = (troco / 5);
        troco -= notaDeCinco * 5;
        System.out.println("Notas de R$: 5,00: " + notaDeCinco);

        int notaDeDois = (troco / 2);
        troco -= notaDeDois * 2;
        System.out.println("Notas de R$: 2,00: " + notaDeDois);

        int notaDeUm = (troco / 1);
        troco -= notaDeUm * 1;
        System.out.println("Notas de R$: 1,00: " + notaDeUm);

        scanner.close();
    }
}