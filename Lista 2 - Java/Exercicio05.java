
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 2.0
 * @since - 17/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.println("Informe, por gentileza, o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe, por gentileza, o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println(
                "Informe, por gentileza, a conta que você deseja fazer: (*) para multiplicacao, (/) para divisao, (+) para soma, (-) para subtracao e (^) para potencia ");
        String operador = scanner.next();

        double resultado = 0.0;
        ;

        if (operador.equals("+")) {
            resultado = num1 + num2;
            System.out.printf("O resultado da soma é: %.2f", resultado);
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
            System.out.printf("O resultado da subtração é: %.2f", resultado);
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
            System.out.printf("O resultado da multiplicação é: %.2f", resultado);
        } else if (operador.equals("/")) {
            resultado = num1 / num2;
            System.out.printf("O resultado da divisão é: %.2f", resultado);
        } else if (operador.equals("^")) {
            resultado = Math.pow(num1, num2);
            System.out.printf("O resultado da potência é: %.2f", resultado);
        } else {
            System.out.println("Erro: operador inválido");
        }

        scanner.close();

    }
}
