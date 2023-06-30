
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Digite o sexo (f/m): ");
            sexo = scanner.next().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.println("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scanner.next().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v")
                && !estadoCivil.equals("d"));

        System.out.println("Dados cadastrados com sucesso!");
        scanner.close();
    }
}
