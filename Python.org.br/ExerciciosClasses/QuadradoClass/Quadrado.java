package QuadradoClass;

public class Quadrado {

  /*
   * Classe Quadrado: Crie uma classe que modele um quadrado:
   * 
   * Atributos: Tamanho do lado
   * 
   * Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
   * 
   */

  public int ladoUm;
  public int ladoDois;

  public int calcularArea() {

    return ladoUm * ladoDois;

   }

  public void mudarValorLadoUm(int ladoUm){

    this.ladoUm = ladoUm;

  }

  public void mudarValorLadoDois(int ladoDois){

    this.ladoDois = ladoDois;

  }

  public int retornarValorLadoUm(){

    return ladoUm;

  }

  public int retonarValorLadoDois(){

    return ladoDois;

  }

  }

