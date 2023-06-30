import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio14 {
    public static void main(String[] args) {

        // João Papo-de-Pescador, homem de bem, comprou um microcomputador para
        // controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso
        // de peixes maior que o estabelecido pelo regulamento de pesca do estado de São
        // Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João
        // precisa que você faça um programa que leia a variável peso (peso de peixes) e
        // calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
        // limite e na variável multa o valor da multa que João deverá pagar. Imprima os
        // dados do programa com as mensagens adequadas.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular excesso de peso de peixes.");

        System.out.println("Informe, por gentileza, o peso de peixes (Em KG): ");
        double peso = scanner.nextDouble();

        if (peso > 50) {

            double peixesExcedente = peso - 50;
            double multaPrecoExcedente = peixesExcedente * 4.0;
            System.out.println("O valor a ser pago pelo excesso de peixes é: " + multaPrecoExcedente);
            System.out.println("João, você excedeu: " + peixesExcedente + "kg de peixes.");

        } else

            System.out.println(
                    "Parabéns João. Desta vez, não será necessário pagar multa em decorrência da quantidade de kgs de peixes.");

        scanner.close();

    }
}