package BolaClass;

public class Bola {

  /*
   * Classe Bola: Crie uma classe que modele uma bola:
   * Atributos: Cor, circunferência, material
   * Métodos: trocaCor e mostraCor
   */

  public String cor;
  public int circunferencia;
  public String material;

  public void trocaCor(String novaCor) {

    this.cor = novaCor;

  }

  public String mostraCor() {

    return cor;

  }

}