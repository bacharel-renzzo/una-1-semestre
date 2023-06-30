package MacacoClass;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    /*
     * Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome e
     * bucho (estomago) e pelo menos os métodos comer(), verBucho() e digerir().
     * 
     * Faça um programa ou teste interativamente, criando pelo menos dois macacos,
     * alimentando-os com pelo menos 3 alimentos diferentes e verificando o conteúdo
     * do estomago a cada refeição.
     * 
     * Experimente fazer com que um macaco coma o
     * outro. É possível criar um macaco canibal?
     */

    Scanner scanner = new Scanner(System.in);
    Macaco macaco1 = new Macaco("Macaco1");
    Macaco macaco2 = new Macaco("Macaco2");

    macaco1.comer("Banana");
    macaco2.comer("Maçã");

    macaco1.verBucho();
    macaco2.verBucho();

    macaco1.comer("Pêssego");
    macaco2.comer("Uva");

    macaco1.verBucho();
    macaco2.verBucho();

    macaco1.digerir();
    macaco2.digerir();

    macaco1.verBucho();
    macaco2.verBucho();

    // Macaco canibal

    macaco1.comer(macaco2.getNome());
    macaco1.verBucho();

    scanner.close();

  }

}
