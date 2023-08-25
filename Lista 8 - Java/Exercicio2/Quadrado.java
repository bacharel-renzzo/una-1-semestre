package Exercicio2;

public class Quadrado {

  public double tamanhoDoLado;

  public void mudarValorLado(double tamanhoDoLado) {

    this.tamanhoDoLado = tamanhoDoLado;

  }

  public double retornarValorLado() {

    return tamanhoDoLado;

  }

  public double calcularArea() {

    return tamanhoDoLado * tamanhoDoLado;

  }

}
