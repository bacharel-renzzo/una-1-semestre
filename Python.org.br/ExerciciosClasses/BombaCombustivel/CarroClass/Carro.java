package BombaCombustivel.CarroClass;

public class Carro {

  BombaCombustivel bombaCombustivel = new BombaCombustivel();

  private double quantidadeCombustivelTanqueDoCarro = 0;
  private double consumoDeCombustivel;

  public double getConsumoDeCombustivel() {

    return consumoDeCombustivel;

  }

  public void setConsumoDeCombustivel(double consumoDeCombustivel) {

    this.consumoDeCombustivel = consumoDeCombustivel;

    System.out.println(consumoDeCombustivel + "quilômetros por litro de combustivel");

  }

  public void andar(double kmRodados) {

    if (quantidadeCombustivelTanqueDoCarro < 0) {

      System.out.println("Você não possui gasolina suficiente para andar de carro.");

    } else {

      quantidadeCombustivelTanqueDoCarro -= consumoDeCombustivel;
      System.out.println("anda " + kmRodados + " quilômetros.");
    }
  }

  public double obterGasolina() {

    return quantidadeCombustivelTanqueDoCarro;

  }

  public double adicionarGasolina(double valorQueSeraAbastecido) {

    return valorQueSeraAbastecido += quantidadeCombustivelTanqueDoCarro;

  }

}
