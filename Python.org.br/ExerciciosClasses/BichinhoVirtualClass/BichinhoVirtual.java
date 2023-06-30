package BichinhoVirtualClass;

public class BichinhoVirtual {
  private String nome;
  private int nivelFome;
  private int nivelTedio;
  
  public BichinhoVirtual(String nome) {
      this.nome = nome;
      this.nivelFome = 0;
      this.nivelTedio = 0;
  }
  
  public void alimentar(int quantidadeComida) {
      nivelFome -= quantidadeComida;
      if (nivelFome < 0) {
          nivelFome = 0;
      }
  }
  
  public void brincar(int tempoBrincadeira) {
      nivelTedio -= tempoBrincadeira;
      if (nivelTedio < 0) {
          nivelTedio = 0;
      }
  }
  
  public void passarTempo(int tempo) {
      nivelFome += tempo;
      nivelTedio += tempo;
  }
  
  public void imprimirEstado() {
      System.out.println("Nome: " + nome);
      System.out.println("Nível de Fome: " + nivelFome);
      System.out.println("Nível de Tédio: " + nivelTedio);
  }
}