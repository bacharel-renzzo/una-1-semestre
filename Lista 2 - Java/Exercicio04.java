
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * author - Renzzo Silva Rocha - RA: 4231925318
 * version - 2.0
 * since - 17/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo que calcula o perímetro do circulo, a área do círculo e o volume de uma esfera.");

        System.out.println(
                "Por favor, digite o número da operação (1 para calcular O perímetro do círculo, 2 para calcular a área do círculo e 3 para calcular o volume da esfera.)");
        int numeroDaOperacao = scanner.nextInt();

        System.out.println("Por favor, informe o diametro do círculo: ");
        double diametroDoCirculo = scanner.nextDouble();

        double raioDoCírculo = diametroDoCirculo / 2.0;
        double perimetroDoCirculo = 2.0 * Math.PI * raioDoCírculo;
        double areaDoCirculo = Math.PI * (Math.pow(raioDoCírculo, 2));
        double volumeDeUmaEsfera = (4.0 / 3.0) * Math.PI * (Math.pow(raioDoCírculo, 3));

        if (numeroDaOperacao < 3) {

            System.out.println("Erro. O código da operação é invalido. ");

        } else if (numeroDaOperacao == 1) {

            System.out.println("O perímetro do círculo é: " + perimetroDoCirculo);

        } else if (numeroDaOperacao == 2) {

            System.out.println("A área do círculo é: " + areaDoCirculo);

        } else if (numeroDaOperacao == 3) {

            System.out.println("O volume da esfera é: " + volumeDeUmaEsfera);

        } else {

            System.out.println("Erro no programa.");

        }

        scanner.close();
    }
}
