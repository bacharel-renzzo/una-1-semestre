
/**
 * Leia atentamente as instruções do programa para obter a melhor experiência de tal.
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 3.0
 * @since - 26/04/2023
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.println("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Senha não pode ser igual ao nome de usuário, tente novamente.");
            }
        } while (senha.equals(usuario));

        System.out.println("Usuário e senha cadastrados com sucesso!");
        scanner.close();
    }
}
