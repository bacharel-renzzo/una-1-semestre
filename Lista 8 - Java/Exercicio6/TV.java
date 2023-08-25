package Exercicio6;

public class TV {

  public int canal = 0;
  public int volume = 0;

  public void informarNumeroCanal(int numeroCanal) {

    this.canal = numeroCanal;

  }

  public void aumentarVolume() {

    if (volume > 0 && volume < 100) {

      volume++;

    } else {

      System.out.println("Error!");

    }

  }

  public void diminuirVolume() {

    if (volume < 0) {

      System.out.println("Error!");

    } else {

      volume--;

    }

  }

}
