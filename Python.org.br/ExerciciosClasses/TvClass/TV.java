package TvClass;

public class TV {

  /*
   * Faça um programa que simule um televisor criando-o como um objeto.
   * 
   * O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir
   * o volume.
   * 
   * Certifique-se de que o número do canal e o nível do volume permanecem dentro
   * de faixas válidas.
   *
   * Faixas válidas (?)
   */

  public int numeroDoCanal;
  public int volumeDoCanal;

  public void aumentarVolumeDoCanal() {
    if (volumeDoCanal < 100) {
      volumeDoCanal++;
    }
  }

  public void diminuirVolumeDoCanal() {
    if (volumeDoCanal > 0) {
      volumeDoCanal--;
    }

  }

  public int getNumeroCanal() {
    return numeroDoCanal;
  }

  public void setNumeroCanal(int novoNumeroCanal) {
    this.numeroDoCanal = novoNumeroCanal;
  }

  public int getVolume() {
    return volumeDoCanal;
  }

}
