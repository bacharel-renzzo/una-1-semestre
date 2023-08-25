package Exercicio3;

public class Retangulo {

  public double base;
  public double altura;

  public void mudarValorLados(double base, double altura) {

    this.base = base;
    this.altura = altura;

  }

  public double retornarValorBase() {

    return base;

  }

  public double retornarValorAltura() {

    return altura;

  }

  public double calcularArea(double base, double altura) {

    return base * altura;

  }

  public double calcularPerimetro(double base, double altura) {

    return base + base + altura + altura;

  }

}
