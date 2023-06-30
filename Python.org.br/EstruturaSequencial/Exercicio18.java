import java.util.Scanner;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 29/04/2023
 */

public class Exercicio18 {
    public static void main(String[] args) {

        // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
        // velocidade de um link de Internet (em Mbps), calcule e informe o tempo
        // aproximado de download do arquivo usando este link (em minutos).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Informe a velocidade da conexão à internet (em Mbps): ");
        double velocidadeInternet = scanner.nextDouble();

        double tamanhoEmBits = tamanhoArquivo * 8.0 * 1024.0 * 1024.0;
        double tempoEmSegundos = tamanhoEmBits / (velocidadeInternet * 1024.0 * 1024.0);
        int tempoEmMinutos = (int) Math.ceil(tempoEmSegundos / 60.0);

        System.out.println("O tempo aproximado de download é de " + tempoEmMinutos + " minutos.");

        scanner.close();

    }
}