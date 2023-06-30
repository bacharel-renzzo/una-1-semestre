package FuncionarioClass;

public class Funcionario {

  private String nome;
  private double salario;

  public Funcionario(String nome, double salario) {

    this.nome = nome;
    this.salario = salario;

  }

  public String getNome() {

    return nome;

  }

  public void setNome(String nome) {

    this.nome = nome;

  }

  public double getSalario() {

    return salario;

  }

  public void setSalario(double salario) {

    this.salario = salario;

  }

  public void aumentarSalario(double percentualDeAumento) {

    double formulaAumentarSalario = salario * percentualDeAumento / 100;
    double novoSalario = formulaAumentarSalario + salario;
    System.out.println("O salario do funcionário " + nome + " foi aumentado para: " + novoSalario);

  }

}
