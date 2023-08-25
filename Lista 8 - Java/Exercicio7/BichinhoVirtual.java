package Exercicio7;

public class BichinhoVirtual {

  public String nome;
  public int fome;
  public int saude;
  public int idade;

  public void alterarNome(String nome) {

    this.nome = nome;

  }

  public void alterarFome(int fome) {

    this.fome = fome;

  }

  public void alterarSaude(int saude) {

    this.saude = saude;

  }

  public void alterarIdade(int idade) {

    this.idade = idade;

  }

  public String retornarNome() {

    return nome;

  }

  public int retornarFome() {

    return fome;

  }

  public int retornarSaude() {

    return saude;

  }

  public int retornarIdade() {

    return idade;

  }

  public String calcularHumor() {

    int humor = (fome + saude) / 2;

    if (humor > 70) {
      return "Feliz";

    }

    else if (humor > 30) {

      return "Neutro";

    }

    else {

      return "Triste";

    }

  }

}
