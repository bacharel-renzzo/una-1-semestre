package PontoERetanguloClass;

public class Ponto {
  private double x;
  private double y;
  
  public Ponto(double x, double y) {
      this.x = x;
      this.y = y;
  }
  
  public void imprimir() {
      System.out.println("Coordenadas do ponto: (" + x + ", " + y + ")");
  }
  
  public double getX() {
      return x;
  }
  
  public double getY() {
      return y;
  }
}