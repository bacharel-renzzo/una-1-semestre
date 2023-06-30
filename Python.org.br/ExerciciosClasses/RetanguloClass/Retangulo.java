package RetanguloClass;

public class Retangulo {

  public double ladoA;
  public double ladoB;

  public void mudarValorLadoARetangulo(double novoValorLadoA) {

    this.ladoA = novoValorLadoA;

  }

  public void mudarValorLadoBRetangulo(double novoValorLadoB) {

    this.ladoB = novoValorLadoB;

  }

  public double retonarValorLadoA() {

    return ladoA;

  }

  public double retonarValorLadoB() {

    return ladoB;

  }

  public double calcularAreaRetangulo(double ladoDireita, double ladoEsquerda) {

    return ladoDireita * ladoEsquerda;

  }

  public double calcularPerimetroRetangulo() {

    return ladoA + ladoB + ladoA + ladoB;

  }

}
