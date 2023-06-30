package EstruturaDeDecisao;

import java.util.Scanner;
import java.util.Locale;

/**
 * Leia atentamente as perguntas do programa para obter a melhor experiência de
 * tal.
 * 
 * @author - Renzzo Silva Rocha - RA: 4231925318
 * @version - 1.0
 * @since - 23/05/2023
 */

public class Exercicio25 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    // Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
    // perguntas são:
    // "Telefonou para a vítima?"
    // "Esteve no local do crime?"
    // "Mora perto da vítima?"
    // "Devia para a vítima?"
    // "Já trabalhou com a vítima?" O programa deve no final emitir uma
    // classificação sobre a participação da pessoa no crime.
    // Se a pessoa responder positivamente a 2 questões ela deve ser classificada
    // como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
    // Caso contrário, ele será classificado como "Inocente".

    System.out.println("====== PERGUNTAS SOBRE O CRIME ======");
    System.out.println("Responda 'sim' ou 'nao' para as perguntas abaixo.");

    System.out.println("Telefonou para a vítima? ");
    String respostaUm = scanner.nextLine().toLowerCase();

    System.out.println("Esteve no local do crime? ");
    String respostaDois = scanner.nextLine().toLowerCase();

    System.out.println("Mora perto da vítima? ");
    String respostaTres = scanner.nextLine().toLowerCase();

    System.out.println("Devia para a vítima? ");
    String respostaQuatro = scanner.nextLine().toLowerCase();

    System.out.println("Já trabalhou com a vítima? ");
    String respostaCinco = scanner.nextLine().toLowerCase();

    int contador = 0;

    if (respostaUm.equals("sim")) {

      contador++;

    }
    if (respostaDois.equals("sim")) {

      contador++;

    }
    if (respostaTres.equals("sim")) {

      contador++;

    }
    if (respostaQuatro.equals("sim")) {

      contador++;

    }
    if (respostaCinco.equals("sim")) {

      contador++;

    }

    if (contador == 2) {

      System.out.println("A pessoa é classificada como: Suspeita.");

    } else if (contador >= 3) {

      System.out.println("A pessoa é classificada como: Cúmplice.");

    } else if (contador == 5) {

      System.out.println("A pessoa é classificada como: Assassino.");

    } else {

      System.out.println("A pessoa não possui classificações quanto a este crime.");

    }

    scanner.close();

  }

}