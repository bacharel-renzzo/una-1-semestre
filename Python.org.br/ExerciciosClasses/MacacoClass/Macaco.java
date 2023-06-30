package MacacoClass;

public class Macaco {

  private String nome;
  private String bucho;

  public Macaco(String nome) {
    this.nome = nome;
    this.bucho = "";
  }

  public String getNome() {
    return nome;
  }

  public void comer(String alimento) {
    if (bucho.isEmpty()) {
      bucho += alimento;
    } else {
      bucho += ", " + alimento;
    }
  }

  public void verBucho() {
    if (bucho.isEmpty()) {
      System.out.println(nome + " está com o bucho vazio.");
    } else {
      System.out.println(nome + " está com o seguinte conteúdo no bucho: " + bucho);
    }
  }

  public void digerir() {
    if (bucho.isEmpty()) {
      System.out.println(nome + " não tem nada no bucho para digerir.");
    } else {
      System.out.println(nome + " está digerindo " + bucho + ".");
      bucho = "";
    }
  }

}